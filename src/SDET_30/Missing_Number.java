package SDET_30;

public class Missing_Number {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,6,7};
		int sum=0,sum1=0;
		for(int i=0;i<a.length;i++) {
			sum=sum+a[i];
		}
		for(int i=1;i<=7;i++) {
			sum1=sum1+i;
		}
		int missing = sum1-sum;
		System.out.println(missing);
	}

}
