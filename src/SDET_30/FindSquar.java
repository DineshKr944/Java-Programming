package SDET_30;

public class FindSquar {

	public static void main(String[] args) {
		int n=5;
		int num=3;
		int power=1;
		while(n>0) {
			power=power*num;
			n--;
		}
		System.out.println(power);
	}
}
