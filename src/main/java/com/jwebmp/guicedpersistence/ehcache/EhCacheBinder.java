package com.jwebmp.guicedpersistence.ehcache;

import com.jwebmp.guicedinjection.abstractions.GuiceInjectorModule;
import com.jwebmp.guicedinjection.interfaces.IGuiceDefaultBinder;
import com.jwebmp.logger.LogFactory;
import org.jsr107.ri.annotations.guice.module.CacheAnnotationsModule;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Binds Caching Annotations to the Hazelcast Provider
 */
@SuppressWarnings("unused")
public class EhCacheBinder
		implements IGuiceDefaultBinder<EhCacheBinder, GuiceInjectorModule>
{
	private static final Logger log = LogFactory.getLog("EhCacheBinder");
	private static boolean registerCacheModule = true;

	public static boolean isRegisterCacheModule()
	{
		return EhCacheBinder.registerCacheModule;
	}

	public static void setRegisterCacheModule(boolean registerCacheModule)
	{
		EhCacheBinder.registerCacheModule = registerCacheModule;
	}

	@Override
	public void onBind(GuiceInjectorModule module)
	{
		if (EhCacheBinder.registerCacheModule)
		{
			EhCacheBinder.log.log(Level.CONFIG, "Registering Cache Annotations Module");
			module.install(new CacheAnnotationsModule());
		}
	}
}
