/*
 * notes/ classwork 
 * 8/01/18
 */
public class Ice {
	
	String shape;
	String color;
	String flavor;
	String fill;
	

	Ice(){
	
		/*
		 * this.shape = "cube";
		 * this.color = "white";
		 * this.fill = "water";
		 */
	}
	
	Ice(String shape, String color, String flavor, String fill){
		this.shape = shape;
		this.color = color;
		this.flavor = flavor;
		this.fill = fill;
	}
	Ice(String shape){
		this.shape = shape;
	}
	Ice (String color, String flavor, String fill){
		this.color = color;
		this.flavor = flavor;
		this.fill = fill;
	}
	
	public static void main(String args[]){
		Ice first = new Ice();
		Ice second = new Ice("Star", "red","sweet","strawberry");
		Ice third = new Ice("diamond");
		Ice fourth = new Ice("Black", "Cola","Cola");
		System.out.println(fourth);
		
		
	}
	
	public String toString(){
		return("color"+ this.color +"\n"+"shape"+this.shape+"\n"+"flavor"+this.flavor+"\n"+"fill"+this.fill);
	}
	
	//write the class, attributes, constructors, toString method. same as we ran here! 
	//every class she asks us to write from this point forward.
	
	
	
	
	
	
}