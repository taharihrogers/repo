/**
	File name: Employee.java
	@author Taharih Rogers
	@version 1.01 September 10th, 2018
*/

public class Employee extends Person
{
	// Instance Variables -- define your private data
                  String office;
                  String officePhone;
                  String dateOfEmploy;

	// Constructors
	public Employee()
	{
		// initialize default values
                        firstName = "";
                        lastName = "";
                        phoneNum = "";
                        address = "";
                        office = "";
                        officePhone = "";
                        dateOfEmploy = "";
	}
	public Employee(String inFName, String inLName, String inNum, String inAddress, String inOffice, String inOffPhone, String inDate) // pass in data to initialize variables
	{
                        firstName = inFName;
                        lastName = inLName;
                        phoneNum = inNum;
                        address = inAddress;
                        office = inOffice;
                        officePhone = inOffPhone;
                        dateOfEmploy = inDate;
	}

	// Set methods - one set method for each instance variable defined above
	//             - purpose is to pass in a value stored in the private variable

	// Get methods - one get method for each instance variable defined above
	//             - purpose is to return the value stored in the private variable

	// Additional methods -- such as for calculation, display

	public String toString()
	{
		// return data as a String
		return "";
	}


}