//Cody Harmon
//Chapter4_Debugging_Assignment

/* 
   This program reads an unspecified number of integers, determines how many positive 
   and negative values have been read, and computes the total and average of the input values 
   (not counting zeros). The program ends with the input 0. The average is displayed as a double. 
*/
import java.util.Scanner;

public class CountAndAverageNumbers {
  public static void main(String[] args) {
    int countPositive = 0, countNegative = 0;
    int count = 0, number = 0;
    double total = 0; 

    Scanner input = new Scanner(System.in);
    System.out.print("Enter an integer, the input ends if it is 0: ");
    number = input.nextInt(); // Changed Double to Int to match defined variable above

    while (number != 0) { //Changed == to !=
      if (number > 0)
        countPositive++;
      else if (number < 0)
        countNegative++;
        
      count = countPositive + countNegative; // Defined equation for count variable
      total = total + number; //Changed total = number to total = total + number so it sums all entries
            
      // Read the next number
      System.out.print("Enter an integer, the input ends if it is 0: ");
      number = input.nextInt();
    }

    if (count == 0) // Changed = to == and changed variable number to variable count
      System.out.println("No numbers are entered except 0");
    else {
      System.out.println("The number of positives is " + countPositive);
      System.out.println("The number of negatives is " + countNegative);
      System.out.println("The total is " + total);
      System.out.println("The average is " + total / count);
    }
  }
}