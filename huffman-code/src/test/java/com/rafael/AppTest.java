/////////////////////////////////////////////////////////////////////
//Adilson Medronha, Felipe Ferro, Rafael Fontana e Nathan Schostack//
/////////////////////////////////////////////////////////////////////

package com.rafael;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;

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
	

	@Test
	public void codeTest() {	
		Map<Character,String> map = new HashMap<Character,String>();
		map = HuffmanCode.createHuffmanCode1("Hello");
		assertTrue(map.containsKey('H'));
		assertTrue(map.containsKey('e'));
		assertTrue(map.containsKey('l'));
		assertTrue(map.containsKey('o'));
	}

	@Test
	public void createCodeWithTableTest() {
		Map<Character,String> outputMap = new HashMap<Character,String>();
		Map<Character,String> inputMap = new HashMap<Character,String>();
		inputMap.put('C', new String("1"));
		inputMap.put('o', new String("3"));
		inputMap.put('l', new String("1"));
		inputMap.put('r', new String("1"));
		inputMap.put('a', new String("1"));
		inputMap.put('d', new String("1"));
		outputMap = HuffmanCode.createHuffmanCode(inputMap);
		assertTrue(outputMap.containsKey('C'));
		assertTrue(outputMap.containsKey('o'));
		assertTrue(outputMap.containsKey('l'));
		assertTrue(outputMap.containsKey('r'));
		assertTrue(outputMap.containsKey('a'));
		assertTrue(outputMap.containsKey('d'));	
	}
	
    private void assertTrue(boolean testResult) {

    }
}
