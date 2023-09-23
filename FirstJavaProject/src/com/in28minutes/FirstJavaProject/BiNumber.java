package com.in28minutes.FirstJavaProject;

public class BiNumber {
	private int num1;
	private int num2;

	public BiNumber(int number1, int number2) {
		this.num1 = number1;
		this.num2 = number2;
	}

	public int add() {
		return num1 + num2;
	}

	public int multiply() {
		return num1 * num2;
	}

	public void doubleTheNumber() {
		num1 = num1 * num1;
		num2 = num2 * num2;
	}

	public int getnumber1() {
		return num1;
	}

	public int getnumber2() {
		return num2;
	}

}

