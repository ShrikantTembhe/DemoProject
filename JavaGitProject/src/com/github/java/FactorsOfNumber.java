package com.github.java;

import java.util.Scanner;
/*
 * enter 10 o/p -> 1 2 5 10 factors of 10
 */
public class FactorsOfNumber {

	public static void numberFactor(int num) {
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				System.out.print(i + " ");
			}
		}
	}
	public static void main(String args[]) {
		Scanner sobj = new Scanner(System.in);
		System.out.println("Enter any number to find factors:");
		int num = sobj.nextInt();
		numberFactor(num);
	}
}