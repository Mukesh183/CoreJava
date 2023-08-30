package static_keyword;

public class StaticVariables {
	
	static int rank=0;
	String Exam;

	public static void main(String[] args) {
		StaticVariables variables = new StaticVariables();
		rank=1;
		variables.Exam="Quertely Exam";
	//	System.out.println("My Rank is "+rank+" in "+variables.Exam); --> o/p:My Rank is 1 in Quertely Exam 
	//Because of execution
		
		StaticVariables variables2 = new StaticVariables();
		rank=5;
		variables2.Exam = "Half Yearly Exam";
		
		System.out.println("My Rank is "+rank+" in "+variables.Exam);//-->My Rank is 5 in Quertely Exam
		System.out.println("My Rank is "+rank+" in "+variables2.Exam);//-->My Rank is 5 in Half Yearly Exam
		

	}

}
