package constructors;

public class Students {
	
	String studentName;
	int rollNo;
	
	//Here default constructor applied we can't see naked eyes
	/*
	 * studentName = null bcz String is a class so that default value is null,
	 * for int default value is 0 and Integer default value is null.
	 */
	public static void main(String[] args) {
		Students students = new Students();
		System.out.println(students.studentName);
		System.out.println(students.rollNo);
		

	}

}
