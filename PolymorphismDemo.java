//Cody Harmon
//Ch_8 Programming Assignment

/**
A program to display employee, faculty and staff info
*/
// Class to demo the Employee, Faculty and Staff classes
public class PolymorphismDemo
{
	public static void main(String[] args)
	{
   
      // Create an array to hold the Person objects
		Person[] people = new Person[6];

      // Create 2 Employee objects - one no arg, one with user info
		people[0] = new Employee();
		people[1] = new Employee("Kenobi, Obiwan", "Human Resources", 2567);
      
      // Create 2 Faculty objects - one no arg, one with user info
      people[2] = new Faculty();
      people[3] = new Faculty("Skywalker, Anikan", "Life Sciences", 8578, "Level 3 Instructor");
      
      // Create 2 Staff objects - one no arg, one with user info
		people[4] = new Staff();
      people[5] = new Staff("Windu, Mace", "Chemistry", 9247, 20);
		
      // Display the objects
		for (Person p : people)
		{
			p.writeOutput();
			System.out.println();
		}
	}
}
