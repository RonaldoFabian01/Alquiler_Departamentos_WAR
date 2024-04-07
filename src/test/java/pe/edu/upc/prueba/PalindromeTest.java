package pe.edu.upc.prueba;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PalindromeTest {

//	@Test
//	void test() {
//		fail("Not yet implemented");
//	}
	
	@Test
	public void whenEmptyString_thenAccept() {
		Palindrome palindromeTester = new Palindrome();
		assertTrue(palindromeTester.isPalindrome(""));
	}
}
