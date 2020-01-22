//Cody Harmon)
//Ch_3 Programming Assignment

// a program that tells the user the season based on the month and the day
import java.util.Scanner;
public class Seasons
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      String season = null;
      System.out.println("Enter the Month of the year:");
      double month = in.nextDouble();
      System.out.println("Enter the day of the month:");
      double day = in.nextDouble();
      
         if (month == 1 || month == 2 || month == 3)
            {
            season = ("Winter");
            }            
         else if (month == 4 || month == 5 || month ==6)
            {
            season = ("Spring");
            }
         else if (month == 7 || month == 8 || month ==9)
            {
            season = ("Summer");
            }
         else if (month == 10 || month == 11 || month == 12)
            {
            season = ("Fall");
            }
         
         if(month % 3 == 0 && day >=21)
            {
            if (season.compareTo("Winter") == 0)
               {
               season = ("Spring");
               }
            else if (season.compareTo("Spring") == 0)
               {
               season = ("Summer");
               }
            else if (season.compareTo("Summer") == 0)
               {
               season = ("Fall");
               }
            else
               {
               season = ("Winter");
               }
              
            }
         
      if (month <1 || month >12)
         {
         System.out.println("The month needs to be 1 through 12");
         System.exit(1);
         }
      
      if (day <1 || day >31)
         {
         System.out.println("The day needs to be 1 through 31");
         System.exit(1);
         }
         
      System.out.println("The season of the year is " + season);
                          
    }
   
}