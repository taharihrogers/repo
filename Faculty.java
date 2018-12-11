
import java.util.Scanner;

/**
	File name: Faculty.java
	@author Taharih Rogers
	@version 1.01 September 10th, 2018
*/

public class Faculty extends Employee implements Changeable
{
	// Instance Variables -- define your private data
                  String rank;

	// Constructors
	public Faculty()
	{
		// initialize default values
                        firstName = "";
                        lastName = "";
                        phoneNum = "";
                        address = "";
                        office = "";
                        officePhone = "";
                        dateOfEmploy = "";
                        rank = "";
	}
	public Faculty(String inFName, String inLName, String inNum, String inAddress, String inOffice, String inOffPhone, String inDate, String inRank) // pass in data to initialize variables
	{
                        firstName = inFName;
                        lastName = inLName;
                        phoneNum = inNum;
                        address = inAddress;
                        office = inOffice;
                        officePhone = inOffPhone;
                        dateOfEmploy = inDate;
                        rank = inRank;
	}

	// Set methods - one set method for each instance variable defined above
	//             - purpose is to pass in a value stored in the private variable

	// Get methods - one get method for each instance variable defined above
	//             - purpose is to return the value stored in the private variable

	// Additional methods -- such as for calculation, display

	public String toString()
	{
                        // Print info
                        return "Faculty " + lastName + ", " + firstName + ", " + rank;
	}
        
                public String change()
                {
                    System.out.println("Enter new name: ");
                    Scanner in = new Scanner(System.in);
                    String newName = in.next();
                    return newName;
                }


}