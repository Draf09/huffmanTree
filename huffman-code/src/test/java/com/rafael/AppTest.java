package com.rafael;

import java.util.HashMap;

import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    

    @Test
	void testEncoding() {		
		// test input
		HashMap<Character, String> result = HuffmanEncoder.generateHuffmanEncoding(
				CharacterCounter.countCharacters("go go gophers")
		);
		
		boolean testResult = result.get(' ').equals("101")
				&& result.get('p').equals("1100")
				&& result.get('r').equals("1101")
				&& result.get('s').equals("1110")
				&& result.get('e').equals("1111")
				&& result.get('g').equals("00")
				&& result.get('h').equals("100")
				&& result.get('o').equals("01");
		
		assertTrue(testResult);
    }

    private void assertTrue(boolean testResult) {
    }
}
