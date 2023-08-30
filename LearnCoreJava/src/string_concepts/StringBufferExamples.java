package string_concepts;



public class StringBufferExamples {

	public static void main(String[] args) {
		System.out.println("String");
		String name="Siva";
		System.out.println(name);
		String fullName = name.concat("priya");	
		System.out.println(fullName);
		System.out.println(name);
		
		System.out.println("StringBuffer");
		StringBuffer name2 = new StringBuffer("Mukesh");
		System.out.println(name2);
		StringBuffer fullName2 = name2.append("Perumal");
		System.out.println(fullName2);
		System.out.println(name2);
		
		
		StringBuffer cricket = new StringBuffer("Asia Cup");
		System.out.println(cricket.reverse());
		StringBuffer tennis = new StringBuffer("Wimbelton");
		System.out.println(tennis.replace(0, 3, "World"));
		System.out.println(tennis.delete(0, 5));
		System.out.println(tennis.insert(0, "Wim"));
		System.out.println(tennis.capacity());


	}

}
