package com.Day1;

import java.util.Scanner;

public class GreaterThan1000OrNot {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		if(num>1000) {
			
			System.out.println("True");
		}
		else
			System.out.println("False");
		

	}

}
