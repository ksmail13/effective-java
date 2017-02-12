package effective.ch2.r1to3;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.math.BigInteger;
import java.util.Random;

import org.junit.Test;

import effective.ch2.r1to3.MyClass;

public class MyClassTest {

	@Test
	public void testMyClass() {
		// is complicate
		MyClass myClass = new MyClass(1, 2);
		
		assertThat(myClass.getA(), is(1));
		assertThat(myClass.getB(), is(2));
	}
	
	@Test
	public void testMyClassWithStaticMethod() {
		// is complicate
		MyClass myClass = MyClass.newInstanceWithAAndB(1, 2);
		
		assertThat(myClass.getA(), is(1));
		assertThat(myClass.getB(), is(2));
	}
	
	@Test
	public void testBigInteger() {
		BigInteger bigInteger = new BigInteger(64, 5, new Random());
		
		System.out.println(bigInteger.longValue());
	}
}
