package com.jwebmp.guicedpersistence.ehcache.config;

import com.jwebmp.guicedinjection.interfaces.IPackageContentsScanner;

import java.util.HashSet;
import java.util.Set;

public class EHCacheIPackageContentsScanner
		implements IPackageContentsScanner
{
	@Override
	public Set<String> searchFor()
	{
		Set<String> output = new HashSet<>();
		output.add("com.jwebmp.guicedpersistence.ehcache");
		return output;
	}
}
