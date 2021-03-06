package com.yahoo.tharam04.countupdown;

/**
 * 
 * @author ThaRam
 * @file Counts up and down to the specified provided number.  
 */
public class CountUpDown {
	
	private static int n; // number
	private static int maxNumber = 99; // number to count up to, count down from 

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		countUp();
		System.out.println();
		countDown();		
	} // end public static void main(String[] args)
	
	private static void countUp(){
		// count up 
		System.out.println("Counting up...");
		for(n = 1; n <= maxNumber; n++){
			System.out.println(n);
		}
		System.out.println("Done counting up.");
	} // end private static void countUp()
	
	private static void countDown(){
		// count down
		System.out.println("Counting down...");
		for(n = maxNumber; n >= 1; n--){
			System.out.println(n);
		}
		System.out.println("Done counting down.");
	} // end private static void countDown()
	
} // end public class CountUpDown
