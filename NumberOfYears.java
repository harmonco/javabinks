//Cody Harmon
//Ch2_Debugging_Assignment

// This program prompts the user to enter the minutes, and displays
// the number of years and remaining days in minutes.  For simplicity,
// assume that a year has 365 days

import java.util.Scanner; // added calling on Scanner
public class NumberOfYears 
{ //moved { down to its own line for looks

  public static void main(String[] args) 
  { //moved { down to its own line for looks
    // Prompt the user to enter the number of minutes
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the number of minutes as a whole number: ");
    int minutes = input.nextInt(); //Changed double to int
    
    int numberOfDays = minutes / (24 * 60); //added () to correct logic error
    int numberOfYears = numberOfDays / 365;
    int remainingDays = numberOfDays % 365; //changed / to %

    // Display results
    System.out.println(minutes + " minutes is approximately " + numberOfYears + 
    " years and " + remainingDays + " days remaining"); // added + before remainingDays
  }
}