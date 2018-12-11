
import java.util.Scanner;

/**
	File name: Student.java
	@author Taharih Rogers
	@version 1.01 September 10th, 2018
*/

public class Student extends Person implements Changeable
{
	// Instance Variables -- define your private data
                final String classStatus; //need to set as constant


	// Constructors
	public Student()
	{
		// initialize default values
                        firstName = "";
                        lastName = "";
                        phoneNum = "";
                        address = "";
                        classStatus = "";
	}
	public Student(String inFName, String inLName, String inNum, String inAddress, String inStatus) // pass in data to initialize variables
	{
                        firstName = inFName;
                        lastName = inLName;
                        phoneNum = inNum;
                        address = inAddress;
                        classStatus = inStatus;
	}


	public String toString()
	{
		// Return info
                        return "Student " + lastName + ", " + firstName + ", " + classStatus;
	}
        
                public String change()
                {
                    System.out.println("Enter new name: ");
                    Scanner in = new Scanner(System.in);
                    String newName = in.next();
                    return newName;
                }


}