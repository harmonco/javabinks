// Class that extends Student to include a level
public class Undergraduate extends Student
{
    // 1 for freshman, 2 for sophomore,
    // 3 for junior, or 4 for senior.
    private int level; 
    
    // Constructs an undergraduate with a level of 0
    public Undergraduate( )
    {
        super( );
        level = 1;
    }
    
    // Constructs an undergraduate with a given name, number and level
    public Undergraduate(String initialName, int initialStudentNumber, 
                         int initialLevel)
    {
        super(initialName, initialStudentNumber);
        // Checks 1 <= initialLevel <= 4
        setLevel(initialLevel); 
    }
    
    // Returns the level  
    public int getLevel( )
    {
        return level;
    }
    
    // Sets the level if it is between 1 and 4
    public void setLevel(int newLevel)
    {
        if ((1 <= newLevel) && (newLevel <= 4))
            level = newLevel;
        else
        {
            System.out.println("Illegal level!");
            System.exit(0);
        }
    }
    
    // Writes all values
    public void writeOutput( )
    {
        super.writeOutput( );
        System.out.println("Student Level: " + level);
    }
    
}

