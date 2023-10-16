package Code;

import java.util.Scanner;

public class palindrom_Number {

	public static void main(String[] args) {
		System.out.println("Enter the integer number");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
	int	s=0,r=0,p=n;
		while(n>0) {
			s=n%10;
			r=(r*10)+s;
			n=n/10;
		}
		if(p==r) {
			System.out.println("it is a palindom number");
		}
		else {
			System.out.println("it is not a palindrom number");
		}
	}
}