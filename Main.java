
import java.util.ArrayList;

/**
	File name: Main.java
	@author Taharih Rogers
	@version 1.01 September 10th, 2018
*/

public class Main
{
    public static void main(String[] args)
    {
        //create the array list
        ArrayList<Person> people = new ArrayList<Person>();
        
        //create objects, adding them to arrayList as we go    
        people.add(new Student("John", "Doe", "1234567899", "123 West Ln, Chester PA 19013", "Freshman"));
        people.add(new Student("Jane", "Doe", "9999991234", "124 West Ln, Chester PA 19013", "Sophmore"));
        people.add(new Student("Alex", "Gray", "9876543211", "125 West Ln, Chester PA 19013", "Junior"));
        people.add(new Faculty("Aubrey", "Little", "1112223333", "126 West Ln, Chester PA 19013", "101 Main", "3333334444", "Sept 1st", "Professor"));
        people.add(new Faculty("Ned", "Chicaine", "9998887777", "127 West Ln, Chester PA 19013", "102 Main", "3333334445", "Nov 1st", "Professor"));
        people.add(new Faculty("Duck", "Newton", "4445556666", "128 West Ln, Chester PA 19013", "103 Main", "3333334446", "Oct 1st", "Professor"));
        people.add(new Staff("Taako", "Youknowfromtv", "4448882222", "129 West Ln, Chester PA 19013", "104 Main", "3333334447", "Dec 1st", "Dean"));
        people.add(new Staff("Magnus", "Burnsides", "3211234444", "130 West Ln, Chester PA 19013", "105 Main", "3333334448", "Jan 1st", "Vice Dean"));
        people.add(new Staff("Merle", "Highchurch", "7539511234", "131 West Ln, Chester PA 19013", "106 Main", "3333334449", "Feb 1st", "Sub Vice Dean"));
        
        //use a loop to call the toString of each object in the arrayList
        for( int i =0; i < people.size(); i++)
        {
            System.out.println(people.get(i).toString());
        }
    }
}