//Cody Harmon.5
//Ch_4 Programming Assignment

import java.util.Scanner;
public class Diamond
{
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
      int number = 0;
      do 
      {
         System.out.println("Enter an odd integer between 1 to 19:");
         number = keyboard.nextInt();
      } 
      while ((number <1) || (number >19) || (number % 2 == 0));
      
      double lineCount;
      int asteriskCount;
      // Print first half of the diamond
      for (lineCount = 1; lineCount <= number; lineCount++)
      {
         for (asteriskCount = 1; asteriskCount <= number - lineCount; asteriskCount++)
         {
            System.out.print(" ");
         }
         for (asteriskCount = 1; asteriskCount <= (lineCount *2 - number); asteriskCount++)
         {
            System.out.print("*");
         }
         System.out.println();
      }
      // Print second half of the diamond
      for (lineCount = number -1.0; lineCount > 0; lineCount--)
      {
         for (asteriskCount = 1; asteriskCount <= number - lineCount; asteriskCount++)
         {
            System.out.print(" ");
         }
         for (asteriskCount = 1; asteriskCount <= lineCount *2 - number; asteriskCount++)
         {
            System.out.print("*");
         }
         System.out.println();
      }
      
         
 
   }
   
}