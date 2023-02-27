package testproject;

import static org.junit.Assert.*;
import org.junit.Test;

public class firsttest {

	@Test
	public void test() {
		test1 t1=new test1();
		int output=t1.add(12, 10);
		assertEquals(22, output);
	}

}
