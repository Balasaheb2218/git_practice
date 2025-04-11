// checking and print eligibility for voting

public class VotingEligible {
	public static void main(String[] args) {
		int age = 16;
		if(age >= 18) {
			System.out.println("You are Eligible to vote.");
		} else if(age<18) {
			System.out.println("Your are Not eligible to vote.");
		}
	}
}