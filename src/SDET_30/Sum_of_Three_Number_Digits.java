package SDET_30;

public class Sum_of_Three_Number_Digits {

	public static void main(String[] args) {
		int n=532;
		int temp=0,s;
		while(n>0) {
			s=n%10;
			temp=temp+s;
			n=n/10;
		}
		System.out.println("Sum of three number Digits "+ temp);
	}
}
