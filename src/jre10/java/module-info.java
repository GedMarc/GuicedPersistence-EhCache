import com.jwebmp.guicedinjection.interfaces.IGuiceDefaultBinder;
import com.jwebmp.guicedpersistence.ehcache.EhCacheBinderIGuice;
import com.jwebmp.guicedpersistence.ehcache.EhCacheEntityManagerProperties;
import com.jwebmp.guicedpersistence.services.PropertiesEntityManagerReader;

module com.jwebmp.guicedpersistence.ehcache {
	exports com.jwebmp.guicedpersistence.ehcache;

	requires com.jwebmp.guicedinjection;
	requires java.logging;
	requires com.jwebmp.logmaster;
	requires cache.annotations.ri.guice;
	requires com.jwebmp.guicedpersistence;

	provides IGuiceDefaultBinder with EhCacheBinderIGuice;
	provides PropertiesEntityManagerReader with EhCacheEntityManagerProperties;

}
