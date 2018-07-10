package com.jwebmp.guicedpersistence.ehcache.config;

import com.jwebmp.guicedinjection.scanners.PackageContentsScanner;

import java.util.HashSet;
import java.util.Set;

public class EHCachePackageContentsScanner
		implements PackageContentsScanner
{
	@Override
	public Set<String> searchFor()
	{
		Set<String> output = new HashSet<>();
		output.add("com.jwebmp.guicedpersistence.ehcache");
		return output;
	}
}
