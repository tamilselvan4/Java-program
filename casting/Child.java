package casting;

class Child extends Parent {
	int id;

	// Overriding the parent method

	@Override void method()
	{
		System.out.println("Method from Child");
	}
}
