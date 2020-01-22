//Cody Harmon
//Ch_2 Programming Assignment

import java.util.Scanner;

public class ConeVolume
{
   //Defining constant PI
   public static final double PI = 3.14159;
   public static void main(String[] args)
   {
   
      Scanner input = new Scanner(System.in);
      // Gathering input from user
      System.out.print("Enter the radius of the cone as an integer (r):");
      double r = input.nextDouble();
      System.out.print("Enter the height of the cone as an integer (h):");
      double h = input.nextDouble();
      
      // Calculating the cone volume
      double volume = PI * (r*r) * (h/3);
      
      // Displaying the volume
      System.out.printf("The volume of the cone is %.2f", volume);
   }
   
}