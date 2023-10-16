package SDET_30;

public class Count_Occurancess_of_char_in_String {

	public static void main(String[] args) {
		String str="Java Programming";
		int count = 0;
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch=='a') {
				count++;
			}
		}
		System.out.println(count);
	}
}
