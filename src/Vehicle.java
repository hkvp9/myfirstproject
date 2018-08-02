/*
 * 
 *
 */
 class Vehicle {
	String make;
	String model;
	String type;
	String color;
	int horsepower;
	String drivetrain;
	int year;
	
	//default constructor
	Vehicle(){
	}
	
	Vehicle(String make,String model, String Type ,String color, int horsepower, String drivetrain, int year){
		this.make = make;
		this.model = model;
		this.type = type;
		this.color = color;
		this.horsepower = horsepower;
		this.drivetrain = drivetrain;
		this.year = year;
	}
	
	
	Vehicle(String make,String model, String Type, String color, int horsepower, String drivetrain){
		this.make = make;
		this.model = model;
		this.type = type;
		this.color = color;
		this.horsepower = horsepower;
		this.drivetrain = drivetrain;
	}
	
	
	Vehicle(String make,String model,String Type,int horsepower, int year){
		
		this.make = make;
		this.model = model;
		this.type = type;
		this.color = color;
		this.year = year;
	}
	
	public static void main(String args[]){
		Vehicle one = new Vehicle();
		Vehicle two = new Vehicle ("Honda", "Civic", "sedan", "red", 205, "manual", 2016);
		Vehicle three = new Vehicle("Chevy", "1500", "Truck", "black", 205, "Automatic");
		Vehicle four = new Vehicle("Ford", "Mustang", "muscle car", 355, 1967);
		three.comparehorsepower(four);
		System.out.println();
	}
	
	void comparehorsepower(Vehicle another){
		if(this.horsepower > another.horsepower){
			System.out.println(this.make + this.model+ " has more horsepower than " + another.make + another.model);
		}
	}
	
	boolean compareHorsepower(Vehicle another){
		if(this.horsepower > another.horsepower){
			System.out.println(this.make + "has more horse-power than" + another.make);
		return true;
		}else{
			return false;
		}
	}
	
	public String toString(){
		return("make " + this.make +"\n" +"model " + this.model+"\n"+ "Type " + this.type+"\n"+"color "+ this.color+"\n"+
			"horsepower "+this.horsepower+"\n"+"drivetrain " + this.drivetrain+"\n"+"year " +this.year);
	}
}
	
