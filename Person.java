/**
	File name: Person.java
	@author Taharih Rogers
	@version 1.01 September 10th, 2018
*/

public class Person
{
	// Instance Variables -- define your private data
                String firstName;
                String lastName;
                String phoneNum;
                String address;

	// Constructors
	public Person()
	{
		// initialize default values
                        firstName = "";
                        lastName = "";
                        phoneNum = "";
                        address = "";
	}
	public Person(String inFName, String inLName, String inNum, String inAddress) // pass in data to initialize variables
	{
                        firstName = inFName;
                        lastName = inLName;
                        phoneNum = inNum;
                        address = inAddress;
	}


	public String toString()
	{
		// return data as a String
		return "";
	}


}