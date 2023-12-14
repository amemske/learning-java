package com.example;


public class OddNumbersForloop{
	public static void oodNumbers() {
		
		for(int i =1; i <=10; i++) {
			if(i % 2 == 0) // if you get an even number, start the loop at the beginning(continue)
				continue;
			System.out.print(i + "");
		}
		
	}
}
