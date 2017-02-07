package micky;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.math.BigInteger;
import java.util.Random;

import javax.swing.plaf.synth.SynthSeparatorUI;

import org.junit.Test;

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
