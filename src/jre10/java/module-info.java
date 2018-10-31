import com.jwebmp.guicedinjection.interfaces.IGuiceDefaultBinder;
import com.jwebmp.guicedpersistence.ehcache.EhCacheBinder;
import com.jwebmp.guicedpersistence.ehcache.EhCacheEntityManagerProperties;
import com.jwebmp.guicedpersistence.services.PropertiesEntityManagerReader;

module com.jwebmp.guicedpersistence.ehcache {
	exports com.jwebmp.guicedpersistence.ehcache;

	requires com.jwebmp.guicedinjection;
	requires java.logging;
	requires com.jwebmp.logmaster;
	requires cache.annotations.ri.guice;
	requires com.jwebmp.guicedpersistence;

	requires com.jwebmp.guicedpersistence.readers.hibernateproperties;

	provides IGuiceDefaultBinder with EhCacheBinder;
	provides PropertiesEntityManagerReader with EhCacheEntityManagerProperties;

}
