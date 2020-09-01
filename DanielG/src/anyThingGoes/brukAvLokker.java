package anyThingGoes;
public class brukAvLokker {
	public static Void loop(){
		for(int i = 1; i < 10;i++) {
			System.out.print("*");
		}
		return null;
	}
	public static void main(String[] args) {
		loop();
		System.out.println("\nNå virker det!");
		loop();
	}
}