package com.Day1;

import java.util.Scanner;

public class AreaOfTrangle13 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the base of a Triangle");
		
		double  base = sc.nextDouble();
		
		System.out.println("Enter the height of a Triangle");
		
		double height = sc.nextDouble();
		
		double area = (base*height)/2;
		
		System.out.println(area);
		
		
		

	}

}
