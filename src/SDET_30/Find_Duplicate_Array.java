package SDET_30;

public class Find_Duplicate_Array {

	public static void main(String[] args) {
		int a[]= {1,3,5,6,8,3,5,2};
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					System.out.print(a[j]+" ");
				}
			}
		}
	}

}
