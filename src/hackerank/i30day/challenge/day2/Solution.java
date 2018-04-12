package hackerank.i30day.challenge.day2;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        for(;;){
        double meal_cost = in.nextDouble();
        int tip_percent = in.nextInt();
       int tax_percent = in.nextInt();
        
        // System.out.printf("The total meal cost is %f dollars.", (meal_cost + tip_percent + tax_percent));
        double tip_doble = meal_cost * (tip_percent / 100.00);
        
        
        double tax_double = meal_cost * (tax_percent / 100.00);
        
        System.out.println(Math.round(meal_cost + tip_doble + tax_double));
        
        if(meal_cost == 1)
        {
        	break;
        }
        }
        
        
        in.close();
    }
}