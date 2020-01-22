//Cody Harmon
//Ch_8 Programming Assignment

// Class that extends Employee to include Staff
public class Staff extends Employee
{
    //initialize interger pay grade
    private int payGrade; 
    
    // Constructs a staff member with a pay grade of 0
    public Staff( )
    {
        super( );
        payGrade = 0;
    }
    
    // Constructs staff member with a given name, department, ID and pay grade
    public Staff(String initialName, String initialDepartment, int initialID, int initialPayGrade)
    {
        super(initialName, initialDepartment, initialID);
        payGrade = initialPayGrade; 
    }
    
    // Returns the pay grade  
    public int payGrade( )
    {
        return payGrade;
    }
    
    // Sets the pay grade
    public void setPayGrade(int newPayGrade)
    {
        payGrade = newPayGrade;
    }
    
    // Writes all values
    public void writeOutput( )
    {
        super.writeOutput( );
        System.out.println("Pay Grade: " + payGrade);
    }
    
}
