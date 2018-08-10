package com.revature.eval.java.core;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Homework1 {
	public static void main(String[] args) {
		Homework1 test = new Homework1();
		test.solveWordProblem("What is 1 plus 1?");
		test.solveWordProblem("What is -1 plus -10?");
		test.solveWordProblem("What is 4 minus -12?");
		test.solveWordProblem("What is -3 multiplied by 25?");
		test.solveWordProblem("What is 33 divided by -3?");
	}
	/**
	 * 20. Parse and evaluate simple math word problems returning the answer as an
	 * integer.
	 * 
	 * Add two numbers together.
	 * 
	 * What is 5 plus 13?
	 * 
	 * 18
	 * 
	 * Now, perform the other three operations.
	 * 
	 * What is 7 minus 5?
	 * 
	 * 2
	 * 
	 * What is 6 multiplied by 4?
	 * 
	 * 24
	 * 
	 * What is 25 divided by 5?
	 * 
	 * 5
	 * 
	 * @param string
	 * @return
	 */
	public int solveWordProblem(String string) {
		// TODO Write an implementation for this method declaration
		String[] stringNum = string.replace("?", "").split(" ");
		List<Integer> number = new ArrayList<>();
		int total = 0;
		
		for(int i = 0; i < stringNum.length; i++) {
			if(stringNum[i].matches(".*\\d+.*")) {
				int temp = Integer.parseInt(stringNum[i]);
				number.add(temp);
			}
		}
		System.out.println(number);
		
		for(String temp : stringNum) {
			if(temp.matches("plus")) {
				System.out.println("This is adding");
				total = number.get(0) + number.get(1);
			}
			else if(temp.matches("minus")) {
				System.out.println("This is subtracting");
				total = number.get(0) - number.get(1);
			}
			else if(temp.matches("multiplied")) {
				System.out.println("This is multiplying");
				total = number.get(0) * number.get(1);
			}
			else if(temp.matches("divided")) {
				System.out.println("This is dividing");
				total = number.get(0) / number.get(1);
			}
		}
		System.out.println(total);
		
		return total;
	}

}
