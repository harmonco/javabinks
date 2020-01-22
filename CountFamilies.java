//Cody Harmon
//Ch_7 Programming Assignment
/**
A program that lets the user input incomes from families and calculates the max,
50% of the max and the amount of families under 50% of the max
*/

import java.util.*;
public class CountFamilies
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      
      //Populate the array with values
      System.out.println("How many families are there?");
      //First number will be the array size
      double int size = input.nextInt();
      // Initialize the array
      double [] families = new double[size];
      //Add the integers to the array
      for (int i = 0; i < families.length; i++)
      {
         System.out.println("Enter the income for family " + (i + 1));
         families[i] = input.nextDouble();
      }
      //Determining max income 
      double maxIncome = 0.0; 
      maxIncome = families[0];
      for (int i = 0; i < size; i++)
         {
            if (maxIncome < families[i])
            {
               maxIncome = families[i];
            }
         }
      //Displaying the max income
      System.out.println("The maximum income is: " + maxIncome);
      
      //calculating and displaying half of the max
      double halfMax = 0;
      halfMax = maxIncome / 2.0;
      System.out.println("50% of maximum income is: " + halfMax);
      
      //Displaying families less than 50% of the max
      System.out.println("\nDisplaying all families with incomes less than 50% of the max: ");
      
      //Also initializing the count for the number of families under the max
      int count = 0;
      for (int i = 0; i < families.length; i++)
      {
         if (families[i] < halfMax)
         {
         System.out.println("Family " + (i + 1) + " had an income " + families[i]);
         count++;         
         }
         
      }
      //Displaying the count of families less than 50% of the max
      System.out.println("The count is: " + count);
   }
   
}