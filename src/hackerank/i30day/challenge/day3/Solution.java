package hackerank.i30day.challenge.day3;

import java.util.Scanner;

public class Solution {
   
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      for(;;){
      int n = scan.nextInt(); 
      //scan.close();
      String ans="";
          
      // if 'n' is NOT evenly divisible by 2 (i.e.: n is odd)
      if(n%2==1){
         ans = "Weird";
      }
      else{
         // Complete the code 
    	  
    	  // If  is even and in the inclusive range of  to , print Weird
    	  if( n >= 6 && n <= 20){
    		  ans = "Weird";
    	  }else {
    		  ans = "Not Weird";
    	  }
      }
      System.out.println(ans);
      }
   }
}
