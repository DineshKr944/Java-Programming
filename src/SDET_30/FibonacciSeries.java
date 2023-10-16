package SDET_30;

public class FibonacciSeries {

	public static void main(String[] args) {
		int a=0,b=1,c=0,n=10;
		for(int i=0;i<=n;i++) {
			System.out.print(a+" ");
			c=a+b;
			b=a;
			a=c;
		}
	}
}
