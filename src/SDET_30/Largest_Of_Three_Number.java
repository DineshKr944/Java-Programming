package SDET_30;

public class Largest_Of_Three_Number {

	public static void main(String[] args) {
		int a=100;
		int b=500;
		int c=200;
		
		if(a>b && a>c) {
			System.out.println(a);
		}
		if(b>a && b>c) {
			System.out.println(b);
		}
		if(c>b && c>a) {
			System.out.println(c);
		}
	}

}
