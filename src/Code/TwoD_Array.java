package Code;

import java.util.Scanner;

public class TwoD_Array {
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Array number");
		int n=sc.nextInt();
		int [][] a=new int[n][n];
		for(int i=0;i<=a.length;i++) {
			for(int j=0;j<=a.length;j++) {
				a[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<=a.length;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
}
 