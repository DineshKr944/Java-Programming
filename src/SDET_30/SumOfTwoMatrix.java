package SDET_30;

import java.util.Scanner;

public class SumOfTwoMatrix {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the n value");
		int n=sc.nextInt();
		int a[][]=new int[n][n];
		int b[][]=new int[n][n];
		int c[][]=new int[n][n];
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("1st Matix");
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("Enter 2nd Matix");
		for(int i=0;i<b.length;i++) {
			for(int j=0;j<b.length;j++) {
				b[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<b.length;i++) {
			for(int j=0;j<b.length;j++) {
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("3rd Matix");
		for(int i=0;i<b.length;i++) {
			for(int j=0;j<b.length;j++) {
				c[i][j]=a[i][j]+b[i][j];
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
	}
}
