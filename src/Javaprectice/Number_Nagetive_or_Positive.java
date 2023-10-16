package Javaprectice;

import java.util.Scanner;

public class Number_Nagetive_or_Positive {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		if(n>=0) {
			System.out.println(n+" is Positive Number");
		}
		else
			System.out.println(n+" is Nagetive Number");	
	}
}
