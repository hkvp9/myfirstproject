/*Hannah Kelly
 * Quiz 3 
 * 8/06/18
 */
class Person {

	private String firstName;
	private String lastName;
	private char lastNameInitial;
	private int age;
	private double weight; //
	private int feet;
	private int inches;

	Person(String firstName, String lastName, double weight, int feet,
			int inches) {
		this.setFirstName(firstName);
		this.setLastName(lastName);
		this.setWeight(weight);
		this.setFeet(feet);
		this.setInches(inches);
	}

	Person(String firstName, char lastNameInitial, double weight, int feet,
			int inches) {
		this.setFirstName(firstName);
		this.setLastNameInitial(lastNameInitial);
		this.setWeight(weight);
		this.setFeet(feet);
		this.setInches(inches);

	}

	Person(String firstName, String lastName, char lastNameInitial, int age,
			double weight, int feet, int inches) {
		this.setFirstName(firstName);
		this.setLastName(lastName);
		this.setLastNameInitial(lastNameInitial);
		this.setAge(age);
		this.setWeight(weight);
		this.setFeet(feet);
		this.setInches(inches);

	}

	Person(String firstName, char lastNameInitial, int age, double weight,
			int feet, int inches) {
		this.setFirstName(firstName);
		this.setLastNameInitial(lastNameInitial);
		this.setAge(age);
		this.setWeight(weight);
		this.setFeet(feet);
		this.setInches(inches);
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastNameInitial(char lastNameInitial) {
		this.lastNameInitial = lastNameInitial;
	}

	public char getLastNameInitial() {
		return lastNameInitial;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getWeight() {
		return weight;
	}

	public void setFeet(int feet) {
		this.feet = feet;
	}

	public int getFeet() {
		return feet;
	}

	public void setInches(int inches) {
		this.inches = inches;
	}

	public int getInches() {
		return inches;
	}

	/*
	 * Person person1 = new Person("Tom", 'H', 152.5, 5, 6); Person person2 =
	 * new Person("Leslie",'K', 32, 122.9, 4, 11); Person person3 = new
	 * Person("Ron", "Swanson", 222.2, 6, 0); Person person4 = new
	 * Person("April", "Ludgate", 110.5, 5, 5);
	 */
	// BMI=(weight * 703)/(heightInInches * heightInInches)
	String calculateBMI() {
		String bmiLevel;
		int heightInInches = (this.feet * 12) + (this.inches);
		double BMI = (this.weight * (703)) / (heightInInches * heightInInches);
		if (BMI > 18.5) {
			bmiLevel = "underweight";
		} else if (BMI <= 18.5 && BMI >= 24.9) {
			bmiLevel = "normal";
		} else if (BMI <= 25 && BMI >= 29.9) {
			bmiLevel = "overweight";
		} else {
			bmiLevel = "overweight";
		}
		return BMI + ":" + bmiLevel;
	}

	// if(Person.getheightininches()=)

	// if(person.BMI(weight*703)/(heightininches*heightininches){

	// BMI level is a string and the value will be ➢ If the BMI is less than
	// 18.5, “Underweight” ➢ If the BMI is between 18.5 and 24.9, “Normal” ➢
	// between 25 and 29.9, “Overweight” ➢ 30 or greater, “Obese”
	// • return bmi + “: ” + bmiLevel

	public String toString() {
		return ("firstName" + this.firstName + "\n" + "lastName"
				+ this.lastName + "\n" + lastNameInitial + this.lastNameInitial
				+ "\n" + age + this.age + "\n" + weight + this.weight + "\n"
				+ feet + this.feet + "\n" + inches + this.inches);
	}

}