package com.revature.eval.java.core;

public class Homework1 {
	public static void main(String[] args) {
		Homework1 test = new Homework1();
		test.isArmstrongNumber(5);
		test.isArmstrongNumber(10);
		test.isArmstrongNumber(153);
		test.isArmstrongNumber(100);
		test.isArmstrongNumber(9474);

	}
	/**
	 * 9. An Armstrong number is a number that is the sum of its own digits each
	 * raised to the power of the number of digits.
	 * 
	 * For example:
	 * 
	 * 9 is an Armstrong number, because 9 = 9^1 = 9 10 is not an Armstrong number,
	 * because 10 != 1^2 + 0^2 = 2 153 is an Armstrong number, because: 153 = 1^3 +
	 * 5^3 + 3^3 = 1 + 125 + 27 = 153 154 is not an Armstrong number, because: 154
	 * != 1^3 + 5^3 + 4^3 = 1 + 125 + 64 = 190 Write some code to determine whether
	 * a number is an Armstrong number.
	 * 
	 * @param input
	 * @return
	 */
	public boolean isArmstrongNumber(int input) {
		int digits = 0;
		int temp = 1;
		int power = 0;
		int correctAnswer = input; 
		int answer = 0;
		while(temp <= input) {
			digits++;
			temp *= 10;
		}
		while(input > 0) {
			power = input % 10;
			input = input / 10;
			answer = (int) (answer + (Math.pow(power, digits)));
		}
		if(answer == correctAnswer) {
			return true;
		} else {
			return false;
		}
	}
}
