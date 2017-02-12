package effective.ch2.r4;

import static org.junit.Assert.*;

import org.junit.Test;

public class NoInstanceTest {

	@Test
	public void testCreateAnomynousAbstractClass() {
		// ??
		new AnomynousAbstrctClass() {
		};
	}
	
	@Test
	public void testCreateAnomynousInterface() {
		// ??
		new AnomynousInterface() {
		};
	}
	
	@Test
	public void testCreateFailNoInstance() {
		// Can't create new instance by new operator
		// new NoInstanceClass();
	}

}
