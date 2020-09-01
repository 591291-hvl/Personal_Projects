package primtall;
/**
 * //Program finner h�yest primtall til en gitt verdi (maxVerdi)
 * @author 47472
 *
 */
public class primtall {
	public static void main(String[] args) {
		int maxVerdi = 10000; // Max verdi for primtall
		int primtall = 0; // Vaiabel som lagrer h�yeste primtall
		int antallGangerDelelig = 0; // Teller antall ganger et tall er delielig
		int timesrun = 0; // Teller antall ganger innerste l�kke kj�rer

		for (int i = 1; i <= maxVerdi; i++) {
			// Velge tall
			antallGangerDelelig = 0;
			for (int j = 1; j <= i; j++) {
				// dele tall
				timesrun++;
				// Sjekker om i er delelig
				if (i % j == 0) {
					antallGangerDelelig++;
				} // Sjekker hvor mange ganger tall i er delelig
				if (antallGangerDelelig > 2) {
					break; // Slutter l�kke 2 hvis i er delelig p� mer enn 2 tall
				}
			} // Setter primtall lik i hvis i kun er delelig 2 ganger
			if (antallGangerDelelig == 2) {
				primtall = i;
			}
		}
		System.out.println(primtall);
		System.out.println(timesrun + "ganger kj�rt");
	}
}