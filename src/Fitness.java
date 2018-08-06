public class Fitness {
	
	
	//static double BMI = (weight * 703)/(heightInInches * heightInInches);
	public static void main(String[] args) {
		//char always in single quotes*
		Person person1 = new Person("Tom", 'H', 152.5, 5, 6);
		Person person2 = new Person("Leslie",'K', 32, 122.9, 4, 11);
		Person person3 = new Person("Ron", "Swanson", 222.2, 6, 0);
		Person person4 = new Person("April", "Ludgate", 110.5, 5, 5);
		
		
		System.out.println(person1.getFirstName()+ ":" + person1.calculateBMI());
			//Person.getBMI();
		System.out.println(person2.getFirstName()+ ":" + person2.calculateBMI());
		System.out.println(person3.getFirstName()+ ":" + person3.calculateBMI());
		System.out.println(person4.getFirstName()+ ":" + person4.calculateBMI());
		
	}
	
	
	
	 //The formula for calculating BMI of a person is: BMI=(weight * 703)/(heightInInches * heightInInches)
	
		
		
	//Inside this method, you will have to first convert person’s height (feet & inches) to inches. To do that, create a local variable called heightInInches 
	//(think about what the data type would be). The value of this variable = (person’s feet * 12) + person’s inches.
	
	
	
}