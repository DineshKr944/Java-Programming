package SDET_30;

import java.util.Scanner;

public class SumOfRowAndColumn {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the n Number");
		int n=sc.nextInt();
		int a[][]=new int [n][n];
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				a[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		for(int i=0;i<a.length;i++) {
			int Row = 0;
			for(int j=0;j<a.length;j++) {
				Row+=a[i][j];
			}
			System.out.println("Sum of Row"+(i+1)+":"+Row);
		}
		for(int i=0;i<a.length;i++) {
			int col = 0;
			for(int j=0;j<a.length;j++) {
				col+=a[j][i];
			}
			System.out.println("Sum of Column"+(i+1)+":"+col);
		}
	}
}
