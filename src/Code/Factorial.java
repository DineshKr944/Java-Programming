package Code;

public class Factorial {
	public int facto(int n) {
		int fact=1;
		for(int i=1;i<=n;i++) {
			fact=fact*i;
		}
		return fact;
	}

	public static void main(String[] args) {
		int n=5;
		Factorial f=new Factorial();
		System.out.println(f.facto(n));
	}
}
