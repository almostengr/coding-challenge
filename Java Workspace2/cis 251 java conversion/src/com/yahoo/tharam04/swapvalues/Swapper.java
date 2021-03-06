package com.yahoo.tharam04.swapvalues;

import java.util.Scanner;

public class Swapper {
	
	private static int x; 
	private static int y;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println("Enter two integer values: ");
		Scanner sc = new Scanner(System.in);
		x = sc.nextInt();
		y = sc.nextInt();
		
		swapValues(x, y);
	
		systemPause();
	}

	public static void systemPause(){
		System.out.println("Press any key to continue...");
		new Scanner(System.in).nextLine();
	}
	
	private static void swapValues(int x, int y){
		int temp;
		
		System.out.println("Original values: " + x + " " + y);
		temp = x;
		x = y; 
		y = temp; 
		System.out.println("Values swapped: " + x + " " + y);
	}
}
