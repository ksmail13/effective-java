package effective.ch2.r5;

import java.security.SecureRandom;
import java.util.Calendar;
import java.util.Random;

import org.junit.Before;
import org.junit.Test;

public class AutoboxingTest {
	
	private final static int CNT = 10000000;
	Runtime r;
	Random rand = new SecureRandom();
	@Before
	public void init() {
		r = Runtime.getRuntime();
	}
	
	@Test
	public void should_int_memory_is_stable() {
		int sum = 0;
		Calendar c = Calendar.getInstance();
		long start = c.getTimeInMillis();
		for(int i=0; i<CNT; i++) {
			sum += 100;
		}
		System.out.println(sum);		
		System.out.println((Calendar.getInstance().getTimeInMillis()-start)+"ms");
	}
	
	@Test
	public void should_integer_memory_is_not_stable() {
		Integer sum = 0;
		Calendar c = Calendar.getInstance();
		long start = c.getTimeInMillis();
		
		for(int i=0; i<CNT; i++) {
			sum += 100;
		}
		
		System.out.println(sum);
		System.out.println((Calendar.getInstance().getTimeInMillis()-start)+"ms");
	}
}
