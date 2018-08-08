package com.revature.eval.java.core;

public class Homework1 {
	public static void main(String[] args) {
		Homework1 test = new Homework1();
		test.isPangram("abcdefghijklmnopqrstuvwxyz");

	}
	/**
	 * 16. Determine if a sentence is a pangram. A pangram (Greek: παν γράμμα, pan
	 * gramma, "every letter") is a sentence using every letter of the alphabet at
	 * least once. The best known English pangram is:
	 * 
	 * The quick brown fox jumps over the lazy dog.
	 * 
	 * The alphabet used consists of ASCII letters a to z, inclusive, and is case
	 * insensitive. Input will not contain non-ASCII symbols.
	 * 
	 * @param string
	 * @return
	 */
	public boolean isPangram(String string) {
		// TODO Write an implementation for this method declaration
		boolean[] alphabetCheck = new boolean[26];
		int index;
		
		for(int i = 0; i < string.length(); i++) {
			if('a' <= string.charAt(i) && string.charAt(i) <= 'z') {
				index = string.charAt(i) - 'a';
				alphabetCheck[index] = true;
			} 
		}
		for(int i = 0; i < alphabetCheck.length; i++) {
			if(alphabetCheck[i] == false) {
				System.out.println("this is not a pangram");
				return false;
			}
		}
		return true;
	}
}
