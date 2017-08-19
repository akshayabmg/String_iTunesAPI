package stringIteration;


import static org.junit.Assert.*;

import org.junit.Test;


public class Stringtest {

	@Test
	public void testMan() {
		String TestNegative1 = "";
		String TestNegative2 = "   ";
		String Test = "Hello to the hell world";
		char ch = 'l';
		String expected =  "Heo to the he word";


		assertEquals(expected, StringIterate.remove(Test, ch));
		assertEquals("", StringIterate.remove(TestNegative1, ch));
		assertEquals("", StringIterate.remove(TestNegative2, ch));
	}
@Test
public void testManItr(){
	String TestNegative1 = "";
	String TestNegative2 = "   ";
	String Test ="she is my sister";
	char ch = 's';
	String expected =  "he i my iter";


	assertEquals(expected, StringIterate.remove(Test, ch));
	assertEquals("", StringIterate.remove(TestNegative1, ch));
	assertEquals("", StringIterate.remove(TestNegative2, ch));
}
}