package com.revature.eval.java.core;

import java.util.ArrayList;
import java.util.List;

public class Homework1 {
	public static void main(String[] args) {
		Homework1 test = new Homework1();
		int[] set = { 4, 6 };
		test.toPigLatin("quick fast run");

	}
	/**
	 * 8. Implement a program that translates from English to Pig Latin.
	 * 
	 * Pig Latin is a made-up children's language that's intended to be confusing.
	 * It obeys a few simple rules (below), but when it's spoken quickly it's really
	 * difficult for non-children (and non-native speakers) to understand.
	 * 
	 * Rule 1: If a word begins with a vowel sound, add an "ay" sound to the end of
	 * the word. Rule 2: If a word begins with a consonant sound, move it to the end
	 * of the word, and then add an "ay" sound to the end of the word. There are a
	 * few more rules for edge cases, and there are regional variants too.
	 * 
	 * See http://en.wikipedia.org/wiki/Pig_latin for more details.
	 * 
	 * @param string
	 * @return
	 */
	public String toPigLatin(String string) {
		// TODO Write an implementation for this method declaration
//		int stringLength = string.length();
//		String pigLatin = string;
//		String trimmed = "";
//		String answer = "";
//		for(int i = 0; i < pigLatin.length(); i++) {
//			if("aeiou".indexOf(pigLatin.charAt(i)) != -1) {
//				trimmed = pigLatin.substring(0, i);
//				pigLatin = pigLatin.substring(i, stringLength);
//				break;
//			}
//		}
//		answer = pigLatin + trimmed + "ay";
		String answer = "";
		
		String[] tokens = string.split(" ");
		
		for(String word : tokens) {
			for(int i = 0; i < word.length(); i++) {
				if("aeiou".indexOf(word.charAt(i)) != -1) {
					answer += word.substring(i, word.length()) + word.substring(0, i) + "ay ";
					break;
				}
			}
		}
		System.out.println(answer);
		return answer.trim();
	}
}
