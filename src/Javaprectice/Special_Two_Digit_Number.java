package Javaprectice;

import java.util.Scanner;

public class Special_Two_Digit_Number {

	public static void main(String[] args) {
		/*Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();*/
		int n=59;
		int a=n%10;
		int b=n/10;
		int sum=(a+b)+(a*b);
		if(sum==n)
			System.out.println(sum+" is a Special Number");
		else
			System.out.println(sum+" is not Special Number");
	}
}
