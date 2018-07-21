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
public class EhCacheBinderIGuice
		implements IGuiceDefaultBinder<GuiceInjectorModule>
{
	private static final Logger log = LogFactory.getLog("EhCacheBinderIGuice");
	private static boolean registerCacheModule = true;

	@Override
	public void onBind(GuiceInjectorModule module)
	{
		if (registerCacheModule)
		{
			log.log(Level.CONFIG, "Registering Cache Annotations Module");
			module.install(new CacheAnnotationsModule());
		}
	}

	public static boolean isRegisterCacheModule()
	{
		return registerCacheModule;
	}

	public static void setRegisterCacheModule(boolean registerCacheModule)
	{
		EhCacheBinderIGuice.registerCacheModule = registerCacheModule;
	}
}
