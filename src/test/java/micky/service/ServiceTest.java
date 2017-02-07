package micky.service;

import static org.junit.Assert.*;

import org.junit.Test;

public class ServiceTest {
	
	@Test
	public void testGetNewService() {
		System.out.println("Service newInstance Test");
		System.out.println(Service.newInstace().getName());
	}
}
