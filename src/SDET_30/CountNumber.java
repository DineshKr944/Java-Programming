package SDET_30;

public class CountNumber {
	public static void main(String[] args) {
		int n=875289;
		int count = 0;
		int s;
		while(n>0) {
			n=n/10;
			count++;
		}
		System.out.println(count);
	}
}
