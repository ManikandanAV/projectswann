package org.practise;

import java.util.Arrays;

public class OccurencesOfCharacter {
	
	public static void main(String[] args) {
		
		String s = "Welcome";
		int[] count = new int[256];
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			count[c]++;
		}
	
		for (int k = 0; k < s.length(); k++) {
			char at = s.charAt(k);
		
		for (int j = 0; j < count.length; j++) {
			
			if(count[j]!=0 && at==(char)j) {
				
				System.out.println((char)j +" = "+count[j]);
			}
		}
		}
	}
}
