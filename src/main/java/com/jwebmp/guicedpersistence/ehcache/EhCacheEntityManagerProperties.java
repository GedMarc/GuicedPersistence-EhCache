package com.jwebmp.guicedpersistence.ehcache;

import com.jwebmp.guicedpersistence.services.IPropertiesEntityManagerReader;
import com.oracle.jaxb21.PersistenceUnit;

import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

@SuppressWarnings("unused")
public class EhCacheEntityManagerProperties
		implements IPropertiesEntityManagerReader
{
	private static String regionName = null;

	/**
	 * Sets a region name if required
	 *
	 * @return The applied region name or null
	 */
	public static String getRegionName()
	{
		return EhCacheEntityManagerProperties.regionName;
	}

	/**
	 * Sets the region name if required
	 *
	 * @param regionName
	 * 		The region name to apply
	 */
	public static void setRegionName(String regionName)
	{
		EhCacheEntityManagerProperties.regionName = regionName;
	}

	@Override
	public Map<String, String> processProperties(PersistenceUnit persistenceUnit, Properties incomingProperties)
	{
		Map<String, String> props = new HashMap<>();
		props.put("hibernate.cache.use_second_level_cache", "true");
		props.put("hibernate.cache.region.factory_class", "org.hibernate.cache.jcache.JCacheRegionFactory");
		props.put("hibernate.javax.cache.provider", "org.ehcache.jsr107.EhcacheCachingProvider");
		return props;
	}

}
