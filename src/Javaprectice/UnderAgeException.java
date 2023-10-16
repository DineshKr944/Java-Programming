package Javaprectice;

public class UnderAgeException extends Exception {
   
	public UnderAgeException() {
		System.out.println("You are not Eligble");
	}
	public UnderAgeException(String massage) {
		super(massage);
	}
		
}
