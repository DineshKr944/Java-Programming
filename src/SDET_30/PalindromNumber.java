package SDET_30;

public class PalindromNumber {

	public static void main(String[] args) {
		int n=2222;
		int s,r=0,p=n;
		while(n>0) {
			s=n%10;
			r=(r*10)+s;
			n=n/10;
		}
		if(r==p) {
			System.out.println(p+" is palindrom Number");
		}
		else {
			System.out.println(p+" is not palindrom Number");
		}
	}

}
