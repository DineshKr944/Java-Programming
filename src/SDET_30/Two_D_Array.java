package SDET_30;

import java.util.Scanner;

public class Two_D_Array {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the n Number");
		int n=sc.nextInt();
		int a[][]=new int[n][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				a[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}

}
