/*
 *joey and rachel- both of them have all other attributes 
 * 
 */
import java.util.Scanner;
public class HRTeam {
	public static void main(String args[]){
		Employee someEmployee = new Employee("Tom Haverford ",5, 44.90,"hourly","February 14th 2000","Part-Time", 28);
		// getters and setters come into the picture
		System.out.println(someEmployee.getSsn()); // this would print null because you have not established 
		if(someEmployee.getSsn() == null){
			Scanner sc = new Scanner(System.in);
			System.out.println("what is "+ someEmployee.getName() + "'s SSN");
			someEmployee.setSsn(sc.nextLine());
		}
		
		System.out.println(someEmployee.getSsn());
		
		
		
		
	}
}
