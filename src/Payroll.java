//information under new employee has to be in the same order that was in the class Employee so that it doesn't ERROR
public class Payroll {

	public static double calculatePay(Employee employee){     //or employee one < one at a time.
		employee.setSalary(90);
		
		double salary;
		/*pay cycle is bi-weekly. this function will be calculating an employee's paycheck for that cycle based on 
		 *the employees salary and payRate.
		 */
		//if the employee has a yearly salary 
		if(employee.getPayRate() == "yearly"){
			salary = (employee.getSalary()/52)*2;
		}
		else if(employee.getPayRate() == "hourly"){
			salary = (employee.getSalary() * employee.getHours()*2);
		}
		else{
			salary = 0.0;
		}
		return salary;
	}
	
	public static void main(String args[]){
		int a= 10; // what is the scope? Still main
		//a = a + "hello"; ERROR can't do because you're trying to assign 'a' to a string when you declared an integer
		
		//Employees are going to have a String name, int employeeId, double salary, String payRate, String joinDate,String typeOfEmployee and int hours
		Employee tom = new Employee("Tom Haverford",5, 44.90,"hourly","February 14th 2000","Part-Time", 28);
		//System.out.println(tom.salary); < error, not visible = private in Employee class
		Employee ron = new Employee ("Ron Swanson", 16, 23.60, "yearly","January 15th 2012", "Full-Time", 43);
		
		tom.compareSalary(ron);
		ron.compareSalary(tom);
		
		//System.out.println(Employee.someNumber);// See Employee class to see code written to be accessible in this class
		//System.out.println(calculatePay(tom));
		//System.out.println(calculatePay(ron));
		
	}
}
