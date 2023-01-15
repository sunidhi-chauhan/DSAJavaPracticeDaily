package com.Day1;

import java.util.Scanner;


public class GreaterValue {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
//		int greaterValue = Math.max(a, b);
//		
//		System.out.println(greaterValue);
		
		if(a > b) {
			
			System.out.println(a);
		}
		else
			System.out.println(b);

	}

}
