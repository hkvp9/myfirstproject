/*
 *  
 *  1.Create a class Employee
 *  2.Employees are going to have a String name, int employeeId, double salary, String payRate, String joinDate,
 *    String typeOfEmployee and int hours
 *  3. All the attributes are private
 *  4. When initially hired, some employees may not have an employeeId or hours. Some employees may have values for all
 *     the attributes. Create constructors accordingly.
 *  5. The above mentioned constructors are the only 2 that are allowed. So, while creating an object of class Employee,
 *     you will be using one of the 2 constructors that you created. (Hint: Do not write the default constructor)
 *  6. Write the toString method
 *  7. Create another class called Payroll in the same project and leave it blank.
 */
 //java util.Scanner
 class Employee {
// declaring all the attributes
	 String name;
	 int employeeid;
	 double salary;
	 String payRate;
	 String joinDate;
	 String typeofEmployee;
	 int hours;
	//when something is private it is only accessible in this/that class
	 static int someNumber = 0;// needs to be added here to be accessible in Payroll class**
	 
	// void setSalary(double newSalary){
		// Scanner sc = new Scanner(System.in);
		 //System.out.println("enter your HR code to set salary");
		 //int hrCode = sc.nextInt();
		 //if(hrCode ==3391){
			// this.salary = newSalary;
		 //}
		 //else{
			// System.out.println("you are not allowed to set the salary");
		// }
		 
	// }
	
	//constructor
	Employee(String name, int employeeid, double salary, String payRate, String joinDate, String typeofEmployee, int hours){
		this.name = name;
		this.employeeid = employeeid;
		this.salary = salary;
		this.payRate = payRate;
		this.joinDate = joinDate;
		this.typeofEmployee = typeofEmployee;
		this.hours = hours;
		}
	
	//public static void main(String args[]){
		//Employee newHire = new Employee ();
		//Employee perminent = new Employee();
		//System.out.println();
	Employee(String name, double salary, String payRate, String joinDate, String typeofEmployee){
		this.name = name;
		this.salary = salary;
		this.payRate = payRate;
		this.joinDate = joinDate;
		this.typeofEmployee = typeofEmployee;
	}
	
	public String toString(){
		return("name"+this.name+"\n"+"employeeid"+this.employeeid + "\n" + "salary"+ this.salary + "\n" +"payRate"+this.payRate+"\n"+"joinDate"+this.joinDate+"\n"+
				"typeofEmployee"+this.typeofEmployee+"\n"+"hours"+this.hours +"\n");
		
		
	}
	
}
