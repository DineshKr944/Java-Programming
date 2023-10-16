package Javaprectice;

public class Even_or_odd {

	public static void main(String[] args) {
		/*int n=23;
		if(n%2==0)
			System.out.println(n+" is Even number");
		else
			System.out.println(n+" is Odd number");*/
		String str="hhgef6fyug3r6";
		int count=0;
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch!=' ')
				count++;
		}
		System.out.println(count);
	}

}
