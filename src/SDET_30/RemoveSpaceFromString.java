package SDET_30;

import java.util.Scanner;

public class RemoveSpaceFromString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String values");
		String str=sc.nextLine();
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch!=' ') {
				System.out.print(ch);
			}
		}
	}
}
