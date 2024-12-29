package conditional;

public class Score {

	public static void main(String[] args) {
		
		int score = 500;
		int income = 6000;
			
		if((score <= 700) && (income < 100000) || (income > 10000) || (score <= 500) && (income <= 10000)) {
			reject();
		}else {
			accept();
		}

	}
	
	public static void reject() {
		System.out.println("Reject");
	}
	
	public static void accept() {
		System.out.println("Accept");
	}

}
