import com.jwebmp.guicedinjection.interfaces.IGuiceDefaultBinder;
import com.jwebmp.guicedpersistence.ehcache.EhCacheBinderIGuice;

module com.jwebmp.guicedpersistence.ehcache {
	exports com.jwebmp.guicedpersistence.ehcache;

	exports com.jwebmp.guicedpersistence.ehcache.config to io.github.lukehutch.fastclasspathscanner,com.jwebmp.guicedpersistence;

	requires com.jwebmp.guicedinjection;
	requires java.logging;
	requires com.jwebmp.logmaster;
	requires cache.annotations.ri.guice;
	requires com.jwebmp.guicedpersistence;

	provides IGuiceDefaultBinder with EhCacheBinderIGuice;
}
