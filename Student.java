// Class that extends Person to include a student number
public class Student extends Person
{
    private int studentNumber;

    // Constructs a student with a student number of 0
    public Student( )
    {
        super( );
        //Indicating no number yet
        studentNumber = 0;
    }
    
    // Constructs a student with a given name and number
    public Student(String initialName, int initialStudentNumber)
    {
        super(initialName);
        studentNumber = initialStudentNumber;
    }

    // Returns the student number
    public int getStudentNumber( )
    {
        return studentNumber;
    }
    
    // Sets the student number
    public void setStudentNumber(int newStudentNumber)
    {
        studentNumber = newStudentNumber;
    }

    // Writes all values
    public void writeOutput( )
    {
        super.writeOutput();
        System.out.println("Student Number: " + studentNumber);
    }

}

