package Javaprectice;

public class ExceptionHandle {

	public static void main(String[] args) {
		int amount=6;
		try
		{
			int d=amount/0;
			System.out.println(d);
		}
		catch (Exception e) {
			System.out.println(e);
		}
		System.out.println(10+20);
	}
}
