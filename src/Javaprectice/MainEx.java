package Javaprectice;

public class MainEx extends UnderAgeException {

	public static void main(String[] args) {
		int age=15;
		try {
			if(age<18) {
				throw new UnderAgeException("You are not Eligible for Voting");
			}
		}
		catch (UnderAgeException e) {
			System.out.println(e);
		}
	}
}
