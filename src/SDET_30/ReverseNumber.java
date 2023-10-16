package SDET_30;

public class ReverseNumber {

	public static void main(String[] args) {
		int n=1234;
		int s,r=0;
		while(n>0) {
			s=n%10;
			System.out.print(s);
			n=n/10;
		}
	}

}
