package effective.ch2.r1to3.service;

import org.junit.Test;

import effective.ch2.r1to3.service.Service;

public class ServiceTest {
	
	@Test
	public void testGetNewService() {
		System.out.println("Service newInstance Test");
		System.out.println(Service.newInstace().getName());
	}
}
