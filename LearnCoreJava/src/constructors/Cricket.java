package constructors;

public class Cricket {
	String matchWinner;


	Cricket(){ 
		System.out.println("Match Abondend due to Rain");
	}

	Cricket(String MOM){
		matchWinner=MOM;
		int totalWicket = 5;
		System.out.println(matchWinner+" is a Man of the Match because of "+totalWicket+ " crucial wicket");
	}

	public static void main(String[] args) {
		Cricket cricket = new Cricket();
		Cricket cricket2 = new Cricket("Ashwin");

	}

}
