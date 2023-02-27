package testproject;

import static org.junit.Assert.*;

import org.junit.Test;

public class namecheck {

	@Test
	public void test() {
		test1 t1=new test1();
		String na=t1.name("Omprakash");
		assertEquals("Omprakash", na);
	}

}
