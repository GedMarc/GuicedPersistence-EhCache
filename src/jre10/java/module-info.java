import com.jwebmp.guicedinjection.interfaces.IGuiceDefaultBinder;
import com.jwebmp.guicedpersistence.ehcache.EhCacheBinder;
import com.jwebmp.guicedpersistence.ehcache.EhCacheEntityManagerProperties;
import com.jwebmp.guicedpersistence.services.PropertiesEntityManagerReader;

module com.jwebmp.guicedpersistence.ehcache {
	exports com.jwebmp.guicedpersistence.ehcache;

	requires transitive cache.annotations.ri.guice;
	requires transitive com.jwebmp.guicedpersistence.readers.hibernateproperties;

	provides IGuiceDefaultBinder with EhCacheBinder;
	provides PropertiesEntityManagerReader with EhCacheEntityManagerProperties;

}
