package exampleOfAssert;

import org.junit.Test;
import static org.junit.Assert.*;

public class TestAssertions {

	@Test
	public void testAssertions() {
		//test data
		String str1 = new String ("abc");
		String str2 = new String ("abc");
		String str3 = null;
		String str4 = "abc";
		String str5 = "abc";
		
		int val1 = 5;
		int val2 = 6;
		
		String[] expectedArray = {"one", "two", "three"};
		String[] resultArray = {"one", "two", "three"};
		
		//This checks to see if two objects are equal
		assertEquals (str1, str2);
		
		//This checks to see if the condition is true
		assertTrue (val1 < val2);
		
		//This checks to see if the condition is false
		assertFalse (val1 > val2);
		
		//This checks if an object isn't null
		assertNotNull (str1);
		
		//This checks if an object is null
		assertNull (str3);
		
		//This checks if two object references point to the same object
		assertSame (str4, str5);
		
		//This checks if two objects references do not point to the same object
		assertNotSame (str1, str3);
		
		//This checks if two arrays are qual to each other
		assertArrayEquals (expectedArray, resultArray);
		
	}
}
