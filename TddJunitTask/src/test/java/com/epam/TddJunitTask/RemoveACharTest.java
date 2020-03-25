package com.epam.TddJunitTask;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RemoveACharTest {
    /* TODO list for given requirements
     * 1.A Char in first character ABCD =>BCD
     * 2.A Char in both first and second character AACD => CD
     * 3.If A Char not in both first and Second Characters BBCD => BBCD
     * 4.If one character A A => ''
     * 5.Empty Character '' => ''
     * 6.If A is in second character BACD => BCD
     * 7. If one different character X => ""
     */
	@Test
	void testFirstAChar() {
		RemoveFirst2As removeFirst2As = new RemoveFirst2As();
		String actual = removeFirst2As.removeAs("ABCD");
		assertEquals("BCD",actual);
	}
	@Test
	void testSecondAChar(){
		RemoveFirst2As removeFirst2As = new RemoveFirst2As();
		String actual = removeFirst2As.removeAs("BACD");
		assertEquals("BCD",actual);
	}
	@Test
	void testBothAChars() {
		RemoveFirst2As removeFirst2As = new RemoveFirst2As();
		String actual = removeFirst2As.removeAs("AACD");
		assertEquals("CD",actual);
	}
	@Test
	void testSingleAChar() {
		RemoveFirst2As removeFirst2As = new RemoveFirst2As();
		String actual = removeFirst2As.removeAs("A");
		assertEquals("",actual);
	}
	@Test
	void testSingleOtherChar() {
		RemoveFirst2As removeFirst2As = new RemoveFirst2As();
		String actual = removeFirst2As.removeAs("B");
		assertEquals("B",actual);
	}
	@Test
	void testEmptyChar(){
		RemoveFirst2As removeFirst2As = new RemoveFirst2As();
		String actual = removeFirst2As.removeAs("");
		assertEquals("",actual);
	}
}




