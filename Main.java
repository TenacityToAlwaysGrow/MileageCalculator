/*
 * Assignment 1 - Java Object Orientated Programming
 * Question 5
 * Jennifer Carr - 672-249317
 */
package assignoneques5;

/**
 *Application to track gas mileage
 */

import java.util.Scanner;

public class Main {


    public static void main(String[] args) 
    {
     Scanner scan=new Scanner(System.in);
     
     //variable to hold array of information for mileage
     int totals[][]  = new int[4][4];
        
     //variable to index rows and columns
     int x;
     int y = 0;
     
     //counter for trip
     
     
     //set variables to hold totals
     double gasMileage;
    
       for (x=0; y < totals[x].length;)
        {
          //a way to keep track of trips
          int trip = 0;
        
          //get information from user - miles driven
          System.out.println("Enter miles driven");
          int miles = scan.nextInt();
          x++;
          
          System.out.println("Enter gallons used");
          int gallons = scan.nextInt();
            y++;
          //calculate mileage for the trip
          gasMileage = miles / gallons;
        
          trip++;

         System.out.printf ("Trip: " +trip+ "\n");
         System.out.printf ("Miles driven: " +miles+ "\n");
         System.out.printf ("Gallons of gas used: " +gallons+ "\n");
         System.out.printf ("Has a mileage of: " +gasMileage+ "\n");            
       }//end for

    }//end main method
  }//end main class

