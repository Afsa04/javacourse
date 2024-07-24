import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Numberdemo {
	@Test
	void factorialtest() {
		int exp=80;
		int act=Numberfunction.getFactorial(5);
		assertEquals(exp, act);
	}


}
