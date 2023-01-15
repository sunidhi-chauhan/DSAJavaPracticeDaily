package com.Day1;

import java.util.Scanner;

//Given the diameter of the circle as input ,print It's area.

public class AreaOfCircle6 {

	public static void main(String[] args) {


		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter the diameter");
		
	      int dia =	sc.nextInt();
	      
	      int radius = dia/2;
	      
	      int area = (22*radius*radius)/7;
	      
	      System.out.println(area);
	      
		

	}

}
