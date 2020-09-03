package primtall;

public class primtall2 {

	public static boolean primtall(int tall) {
		int delelig = 0;
		boolean primtall = false;
		for (int i = 1; i <= tall; i++) {
			if (tall % i == 0) {
				delelig++;
			}
			if (delelig == 3) {
				break;
			}
		}
		if (delelig == 2) {
			primtall = true;
		}
		return primtall;
	}

	public static void main(String[] args) throws InterruptedException {
		for (int j = 1; j <= 10000; j++) {
			if (primtall(j) == true) {
				System.out.println(j);
				Thread.sleep(1);
			}
		}
	}
}