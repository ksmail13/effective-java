package effective.ch2.r5;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringTest {

	String s1 = "asdf";
    String s12 = "asdf";
    String s2 = new String("asdf");
	
	@Test
	public void should_s1_s12_is_same() {
	    assertTrue(s1 == s12);
	}
	
	@Test
	public void should_s1_s2_is_not_same() {
		assertFalse(s1 == s2);
	}
	
	@Test
	public void should_s1_s2_is_equal() {
		assertTrue(s1.equals(s2));
	}

}
