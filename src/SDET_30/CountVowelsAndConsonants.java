package SDET_30;

import java.util.Scanner;

class CountVowelsAndConsonants {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String value");
		String str=sc.nextLine();
		int vlcount=0,concount=0;
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch!=' '&& ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') {
				vlcount++;
			}
			else {
				concount++;
			}
		}
		System.out.println(vlcount);
		System.out.println(concount);
	}
}

