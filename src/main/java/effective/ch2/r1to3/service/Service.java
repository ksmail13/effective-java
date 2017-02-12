package effective.ch2.r1to3.service;

public interface Service {
	String getName();
	
	public static Service newInstace() {
		return new DefaultService();
	}
}