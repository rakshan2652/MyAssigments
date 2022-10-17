package Week3.Day1homework;

public class Desktop extends Computer{
	public void desktopSize() {
		System.out.println("Desktopsize 14 inches");
	}

	public static void main(String[] args) {
		Desktop D1 = new Desktop();
		D1.computerModel();
		D1.desktopSize();
	}
}
