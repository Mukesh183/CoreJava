package static_keyword;

public class StaticMethods {
	
	public static void Method1() {
		// NonStatic(); not possible
		System.out.println("Im static method");
	}
	
	public void NonStatic() {
		Method1(); //possible
		System.out.println("Im non static method");
	}

	public static void main(String[] args) {
		
		StaticMethods nonstatic = new StaticMethods();
		nonstatic.NonStatic();
		Method1();

	}

}
