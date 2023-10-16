package Javaprectice;

public class Childs extends parent {

		public void Display() {
			System.out.println("it's a child class");
		}
		public void Show() {
			System.out.println("it's a Childs class");
		}
		public static void main(String[] args) {
			parent c=new Childs();
			c.Display();
			c.Show();
		}
}
