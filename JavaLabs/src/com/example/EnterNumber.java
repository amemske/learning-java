package com.example;
import java.util.Scanner;

public class EnterNumber {
	public static void enterNumberOne() {
		Scanner scanner = new Scanner(System.in);
		int i=0;
		do {
			System.out.println("Please enter a number between 1 and 10");
			i = scanner.nextInt();
		} while(i < 1 || i > 10);
		
		System.out.println("You entered:" + i);
	}
}

