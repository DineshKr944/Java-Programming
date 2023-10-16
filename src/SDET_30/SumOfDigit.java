package SDET_30;

public class SumOfDigit {

	public static void main(String[] args) {
		String str="DInesh23 lkum2a3r5";
		int sum=0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)>='0' && str.charAt(i)<='9') {
				int n=str.charAt(i)-48;
				sum+=n;
			}
		}
		System.out.println(sum);
	}
}
