package Javaprectice;

import java.util.Scanner;

public class Ptr01 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i;j++) {
				System.out.print("  ");
			}
			int x=1;
			for(int k=1;k<=i*2-1;k++) {
				System.out.print(x+" ");
				if(k<i) {
					x++;
				}
				else {
					x--;
				}
			}
			System.out.println();
		}
	}
}
