package micky.service;

import java.util.concurrent.ConcurrentHashMap;

public class Services {
	private static final ConcurrentHashMap<String, Provider> cache = new ConcurrentHashMap<>();
	private static final String DEFAULT = "___default___";
	
	
	public static void setDefaultServiceProvider(Provider p) {
		cache.put(DEFAULT, p);
	}
	
	public static void addServiceProvider(String name, Provider p) {
		cache.put(name, p);
	}
	
	public static Service newInstance() {
		return cache.get(DEFAULT).newService();
	}
	
	public static Service newInstance(String providerName) {
		Provider provider = cache.get(providerName);
		if(provider == null) {
			throw new IllegalArgumentException("no provider");
		}
		
		return provider.newService();
	}
	
	private Services() {
		throw new AssertionError();
	}
}