package Javaprectice;

public class TubeLight extends Bulb {

	public void SwitchONN() {
		System.out.println("Bulb is ONN");
	}
	public void SwitchOFF() {
		System.out.println("Bulb is OFF");
	}
	public static void main(String[] args) {
		TubeLight tl=new TubeLight();
		tl.SwitchOFF();
		tl.Show();
	}
}
