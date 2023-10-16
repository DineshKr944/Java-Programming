package SDET_30;

public class Find_MaximumNumber_in_Array 
{
	public static void main(String[] args)
	{
		int a[]= {21,12,32,42,11,22,13,24,24};
		int temp=0;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++)	{
				if(a[i]<a[j]) {
					temp=a[i]+a[j];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		int max=0;
		int min=0;
		for(int i=0;i<a.length;i++) {
			max = a[0];
			min = a[i];
		}
		System.out.println("Maximum number in this Array="+max);
		System.out.println("Minimum number in this Array="+min);
	}
}
