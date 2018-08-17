

public class Dog {
	private String breed;
	private String name;
	private String color;
	private int hungry;
	private int energy;
	
	public String getColor() {
		return color;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBreed() {
		return breed;
	}

	public int getHungry() {
		return hungry;
	}

	public int getEnergy() {
		return energy;
	}

	public Dog(String breed, String name,String color, int hungry, int energy){
		this.color = breed;
		this.name = name;
		this.breed = color;
		this.hungry = hungry;
		this.energy = energy;	
	}
	
	public void sleep(){
		hungry++;
		energy++;
	}
	
	public void eat(){
		hungry--;
		energy++;
	}
	
	private void  bark(){
		System.out.println("Too Loud!" );
	}
	
	public String toString(){
		return(breed + this.breed + "\n"+ "name"+this.name + "\n"+"color"+this.color+"\n"+"hungry"+this.hungry+"\n"
				+"energy"+this.energy+"\n");
		
	}
	

}