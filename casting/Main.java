package casting;

public class Main {

	public static void main(String[] args)
	{
		// Upcasting
		Parent p = new Child();
		p.name = "tamilselvan";

		//Printing the parentclass name
		System.out.println(p.name);

		//parent class method is overridden method
		p.method();

		// Trying to Downcasting Implicitly
		// Child c = new Parent(); - > compile time error

		// Downcasting Explicitly
		Child c = (Child)p;

        Child c1 = (Child) new Parent();

		c.id = 1;
        // c1.id = 0;
		System.out.println(c.name);
		System.out.println(c.id);
        // System.out.println(c1.id);

		c.method();
	}
}