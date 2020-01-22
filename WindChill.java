//Cody Harmon
//Ch3_Debugging_Assignment


import java.util.Scanner; //changed scanner to capitalized Scanner

public class WindChill 
{
  // Main method
  public static void main(String[] args) 
  {
    Scanner input = new Scanner(System.in);
    // Enter the temperature in Fahrenheit
    System.out.print("Enter the temperature in Fahrenheit: "); 
    double fahrenheit = input.nextDouble();
    
    if (fahrenheit < -58 || fahrenheit > 41) //changed && to ||(or)
      {  //added { to open section
      System.out.print("Temperature must be between -58 degrees F and 41 degrees F");
      System.exit(1); // Exiting the program is valid if input is incorrect
      }  //added { to close section
  
    // Enter the wind speed miles per hour
    System.out.print("Enter the wind speed miles per hour: ");
    double speed = input.nextDouble();
    
    if (speed < 2) //added () around the speed>2
    {
      System.out.println("Speed must be greater than or equal to 2");
      System.exit(2); // Exiting the program is valid if input is incorrect //changed System exit process to 2 to match assignment example
    }

    // Compute wind chill index, the formula is correct as coded
    double windChillIndex = 35.74 + 0.6215 * fahrenheit - 35.75 *
      Math.pow(speed, 0.16) + 0.4275 * fahrenheit * 
      Math.pow(speed, 0.16);
      
    // Display the result
    System.out.println("The wind chill index is " + windChillIndex); //Capitalized the "C" in Chill to match symbol above
  }
}