package exception_handling;

public class TryCatchFinallyExample {

	public static void main(String[] args) {
		try {
			System.out.println(2/0);
		} catch (ArithmeticException e) {
			System.out.println("dont divide by zero");
		}catch (Exception e) {
			System.out.println("Im the parent of all execption");
		}
		finally {
			System.out.println("Dont do it again");
		}

	}

}
