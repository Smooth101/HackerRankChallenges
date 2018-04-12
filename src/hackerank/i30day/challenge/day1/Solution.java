package hackerank.i30day.challenge.day1;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		int i = 4;
		double d = 4.0;
		String s = "Hackerank ";
		
		Scanner scan = new Scanner(System.in);
		Scanner scan1 = new Scanner(System.in);

//		int ii  = scan.nextInt();
//		
//		double dd = scan.nextDouble();

		// scan.nextLine();
		String ss = scan1.nextLine();
		String ss2 = scan1.nextLine();
		String ss3 = scan1.nextLine();
		
		
        /* Read and save an integer, double, and String to your variables.*/
        // Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.
/*        
         Print the sum of both integer variables on a new line. 
		System.out.println(i + ii);

         Print the sum of the double variables on a new line. 
		System.out.println(d  + dd);*/
        /* Concatenate and print the String variables on a new line; 
        	the 's' variable above should be printed first. */
		System.out.println(s + ss);
		
		scan.close();
	}
}
