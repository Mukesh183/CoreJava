package polymorphism_oop;

public class MethodOverlodingExaplain {
	
	public void dataTypeExample(int a,int b) {
		System.out.println("This is int data type: "+a+","+b);
	}
	public void dataTypeExample(String a,String b) {
		System.out.println("This is String data type: "+a+","+b);
	}
	public void dataTypeExample(int a,String b) {
		System.out.println("This is int and String data type: "+a+","+b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverlodingExaplain overLoading = new MethodOverlodingExaplain();
		overLoading.dataTypeExample(18, 07);
		overLoading.dataTypeExample("Mukesh", "Perumal");
		overLoading.dataTypeExample(3, "Moon");

	}

}
