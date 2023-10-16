package Code;

public class ReverseNumber {

	public static void main(String[] args) {
		int	n=123,s=0,r=0;
		while(n>0) {
			s=n%10;
			r=s;
			n=n/10;
			System.out.print(r);
		}
	}
}
