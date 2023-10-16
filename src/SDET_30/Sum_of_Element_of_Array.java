package SDET_30;

public class Sum_of_Element_of_Array {

	public static void main(String[] args) {
		int a[]= {10,13,43,35};
		int sum = 0;
		for(int i=0;i<a.length;i++) {
			sum=sum+a[i];
		}
		System.out.println(sum);
	}
}
