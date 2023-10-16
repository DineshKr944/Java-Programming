package Javaprectice;

public class AirTel 
{
	public static void payment(String un,String pw) {
		System.out.println("Dinesh is my username and kumar is my password");
	}
	public static void payment(String name,String dob,long mobi) {
		System.out.println("Dinesh+10/12/1997+865193331");
	}
	public static void payment(double balance) {
		System.out.println("my balance");
	}
	public static void main(String[]args) {
		/*AirTel a=new AirTel();
		a.payment(1234151.3);
		a.payment("Dinesh","Kumar");*/
		AirTel.payment(1234151.3);
		AirTel.payment("Dinesh","Kumar");
	}
}
