package com.jwebmp.guicedpersistence.ehcache;

import com.jwebmp.guicedinjection.interfaces.IGuiceScanJarExclusions;
import com.jwebmp.guicedinjection.interfaces.IGuiceScanModuleExclusions;

import javax.validation.constraints.NotNull;
import java.util.HashSet;
import java.util.Set;

public class EhCacheModuleExclusions
		implements IGuiceScanJarExclusions<EhCacheModuleExclusions>,
				           IGuiceScanModuleExclusions<EhCacheModuleExclusions>
{
	@Override
	public @NotNull Set<String> excludeJars()
	{
		Set<String> strings = new HashSet<>();

		strings.add("cache-annotations-ri-common-*");
		strings.add("cache-annotations-ri-guice-*");
		strings.add("cache-api-*");
		strings.add("hibernate-jcache-*");
		strings.add("ehcache-*");

		return strings;
	}

	@Override
	public @NotNull Set<String> excludeModules()
	{
		Set<String> strings = new HashSet<>();

		strings.add("com.jwebmp.guicedpersistence.ehcache");

		strings.add("com.jwebmp.guicedinjection");
		strings.add("java.logging");
		strings.add("com.jwebmp.logmaster");
		strings.add("cache.annotations.ri.guice");
		strings.add("com.jwebmp.guicedpersistence");

		strings.add("com.jwebmp.guicedpersistence.readers.hibernateproperties");
		strings.add("java.validation");

		return strings;
	}
}
