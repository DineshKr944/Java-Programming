package SDET_30;

public class Count_Even_odd_Number_In_digits {

	public static void main(String[] args) {
		int n=89876;
		int even=0,odd=0;
		while(n>0) {
			n=n/10;
			if(n%2==0) {
				even++;
			}
			else {
				odd++;
			}
		}
		System.out.println("Count Even Number "+even);
		System.out.println("Count odd Number "+odd);
	}
}
