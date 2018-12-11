/**
	File name: Staff.java
	@author Taharih Rogers
	@version 1.01 September 10th, 2018
*/

public class Staff extends Employee
{
	// Instance Variables -- define your private data
                 String title;

	// Constructors
	public Staff()
	{
		// initialize default values
                        firstName = "";
                        lastName = "";
                        phoneNum = "";
                        address = "";
                        office = "";
                        officePhone = "";
                        dateOfEmploy = "";
                        title = "";
	}
	public Staff(String inFName, String inLName, String inNum, String inAddress, String inOffice, String inOffPhone, String inDate, String inTitle) // pass in data to initialize variables
	{
                        firstName = inFName;
                        lastName = inLName;
                        phoneNum = inNum;
                        address = inAddress;
                        office = inOffice;
                        officePhone = inOffPhone;
                        dateOfEmploy = inDate;
                        title = inTitle;
	}

	

	public String toString()
	{
                        // Print info
                        return "Staff " + lastName + ", " + firstName + ", " + title;
	}


}