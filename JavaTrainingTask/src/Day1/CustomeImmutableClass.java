package Day1;

//final class so that this calss can't be over ridden
final class Immutables
{
	// private members
	private String name;
	private int roll;
	
	//to assain values we used constructor
	public Immutables(String name, int roll) {
		super();
		this.name = name;
		this.roll = roll;
	}
	
	//only getter are used so that we can only get the values
	public String getName() {
		return name;
	}
	public int getRoll() {
		return roll;
	}
	
	
}

public class CustomeImmutableClass
{
	public static void main(String arg[])
	{
		Immutables im = new Immutables("prashanth", 1);
		
		//Immutables im = new Immutables("chinnu", 2); exception be like Duplicate local variable 'im' 
		
		System.out.println(im.getName());
		System.out.println(im.getRoll());
			}

}
