package SDET_30;

public class LinerSearch {

	public static void main(String[] args) {
		int a[]= {3,2,4,5,6,73,32};
		int Search=730;
		boolean flag=false;
		for(int i=0;i<a.length;i++) {
			if(Search==a[i]) {
				System.out.println("Element Found at="+i);
				flag=true;
				break;
			}
		}
		if(flag==false) {
			System.out.println("Element Not Founded");
		}
	}
}
