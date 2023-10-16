package SDET_30;

public class PrimeNumber_or_Not {

	public static void main(String[] args) {
		int n=23;
		int temp=0;
		if(n==0 ||n==1) {
			System.out.println("it is not prime number");
		}
		else {
			for(int i=2;i<=n-1;i++) {
				if(n%i==0) {
					temp++;
				}
			}
			if(temp==0) {
				System.out.println("it is prime number");
			}
			else {
				System.out.println("it is not prime number");
			}
		}
	}

}
