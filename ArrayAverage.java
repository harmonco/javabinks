//Cody Harmon
//Ch_7 Debugging Assignment

// This program sums up the elements in an array and displays the average
// of the elements in the array
public class ArrayAverage 
{
  public static void main(String[] args) 
  {
    // Intialize the array
    double[] myArray = {5.6, 4.5, 3.3, 13.2, 4.0, 34.33, 34.0, 45.45, 99.993, 111.23};
     // added myArray = {values} to array in order to complete statement (removed from its own line) 
    
    double total = 0.0; //finished initializing total with a value of 0.0
    
    // Sum up the array elements
    for (int i = 0; i < myArray.length; i++) //Changed <= to < to correct logic error to account for position 0 in array
    {
      total += myArray[i]; //Changed [1] to [i] to sum for all values in array
    }
    
    // Calculate the average
    double average = total / (myArray.length); //Changed myArray.length - 1 to only myArray.length to correct logic
    System.out.println("The average of the array is " + average);
  }
}
