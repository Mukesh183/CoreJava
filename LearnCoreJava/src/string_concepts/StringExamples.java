package string_concepts;

public class StringExamples {

	public static void main(String[] args) {
		String Edudetails = new String("UG");
		System.out.println(Edudetails);
		String name = "mukesh";
		System.out.println(name.charAt(3));
		System.out.println(name.length());
		System.out.println(name.equals("Mukesh"));
		System.out.println(name.equalsIgnoreCase("Mukesh"));
		System.out.println(name.isEmpty());
		System.out.println(name.contains("s"));
		System.out.println(name.contentEquals("esh"));// to look for exact same like Mukesh
		System.out.println(name.substring(2));//start with begin value include begin value
		System.out.println(name.substring(2, 5));//start with begin value include begin value but not end value
		System.out.println(name.concat(" perumal"));
		System.out.println(name.replace('k', 'g'));
		System.out.println(name.replace("kesh", "ks"));
		System.out.println(name.indexOf('e'));
		System.out.println(name.indexOf("uke"));
		System.out.println(name.indexOf('s', 1));
		System.out.println(name.indexOf("es", 2));
		System.out.println(name.lastIndexOf('u'));
		System.out.println(name.trim());
		int number = 18;
		System.out.println(String.valueOf(number));
		System.out.println(name.toUpperCase());
		System.out.println(name.toLowerCase());
		System.out.println(String.join("/", "18","03","2000"));
		String dateOfBirth = "18/03/2000";
		String[] splitTheDOB = dateOfBirth.split("/");
		for(String splitting:splitTheDOB) {
			System.out.println(splitting);
		}
	}

}
