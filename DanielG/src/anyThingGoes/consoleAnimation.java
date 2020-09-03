package anyThingGoes;

public class consoleAnimation {

	public static void space(int x) {
		for (int i = 1; i < x; i++) {
			System.out.print(" ");
		}
	}

	public static void star(int x) {
		for (int i = 1; i < x; i++) {
			System.out.print("*");
		}
	}

	public static void main(String[] args) throws InterruptedException {

		int n = 0;
		int x = 20;
		boolean stig = true;
		for (int i = 1; i < 1000; i++) {
			if (stig == true) {
				n += 2;
				x--;
			} else {
				n -= 2;
				x++;
			}
			space(x);
			star(n);
			space(x);
			System.out.println("");
			if (n > 20) {
				stig = false;
			}
			if (n < 0) {
				stig = true;
			}
			Thread.sleep(50);
		}

	}
}