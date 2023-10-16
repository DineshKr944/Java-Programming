package Javaprectice;
import java.util.Scanner;

public class patternDash {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int i,j,k;
		for(i=1;i<=3;i++)
		{
			if(i==3/2+1) {
				for(j=1;j<=n/2;j++)
				{
					System.out.print("  ");
				}
					System.out.print("b");
			}
			else
			for(k=1;k<=n;k++)
			{
				if((k+1)%2==0)
					System.out.print("a"+" ");
				else
					System.out.print("b"+" ");
			}
			System.out.println();
		}
	}
}