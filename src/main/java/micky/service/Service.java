package micky.service;

public interface Service {
	String getName();
	
	public static Service newInstace() {
		return new DefaultService();
	}
}