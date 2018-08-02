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
	 private String name;
	 private int employeeid;
	 private double salary;
	private String payRate;
	 public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEmployeeid() {
		return employeeid;
	}

	public void setEmployeeid(int employeeid) {
		this.employeeid = employeeid;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getPayRate() {
		return payRate;
	}

	public void setPayRate(String payRate) {
		this.payRate = payRate;
	}

	public String getJoinDate() {
		return joinDate;
	}

	public void setJoinDate(String joinDate) {
		this.joinDate = joinDate;
	}

	public String getTypeofEmployee() {
		return typeofEmployee;
	}

	public void setTypeofEmployee(String typeofEmployee) {
		this.typeofEmployee = typeofEmployee;
	}

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	public static int getSomeNumber() {
		return someNumber;
	}

	public static void setSomeNumber(int someNumber) {
		Employee.someNumber = someNumber;
	}

	private String joinDate;
	 private String typeofEmployee;
	 private int hours;
	 private String ssn;
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
	//toString() method
	
	//methods, compared the salary of the current object with that of the object sent to it
	void compareSalary(Employee another){
		if(this.salary > another.salary){
			System.out.println(this.name + "has higher salary than" + another.name);
		}
	}
		
		 boolean isSalaryHigher(Employee that){
			if(this.salary > that.salary){
				return true;
			}
			else{
				return false;
			}
		}
	}
	
	
	
	
	
	
	
	
	
	

