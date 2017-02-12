package effective.ch2.r1to3.service;

import org.junit.BeforeClass;
import org.junit.Test;

import effective.ch2.r1to3.service.BServiceProvider;
import effective.ch2.r1to3.service.DefaultServiceProvider;
import effective.ch2.r1to3.service.Services;

public class ServicesTest {

	@BeforeClass
	public static void setUp() {
		Services.setDefaultServiceProvider(new DefaultServiceProvider());
		Services.addServiceProvider("B", new BServiceProvider());
	}
	
	@Test
	public void testDefaultProvider() {
		System.out.println("Default provider");
		System.out.println(Services.newInstance().getName());
	}
	
	@Test
	public void testBProvider() {
		System.out.println("B provider");
		System.out.println(Services.newInstance("B").getName());
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testFailByNotExistProvider() {
		System.out.println("C Provider");
		System.out.println(Services.newInstance("C").getName());
	}
}
