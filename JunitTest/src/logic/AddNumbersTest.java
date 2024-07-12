package logic;

import org.junit.Assert;
import org.junit.Test;

public class AddNumbersTest {
	
	
	@Test
	public void addTest() {
		int result=AddNumbers.add(10, 20);
		int expected=30;
		Assert.assertEquals(expected, result);
	}

}
