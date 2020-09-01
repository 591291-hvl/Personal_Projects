package primtall;
// Programm finner ut om en verdi (primtall) er et primtall
public class primtall1 {
	public static void main(String[] args) {
		
		int primtall = 1095989;
		int antall = 0;
		
		for(int i = 1; i < primtall; i++) {	
			if(primtall % i == 0) {
				antall++;	
			}
		}
		if(antall == 1) {
			System.out.println(primtall +" er et primtall");
		}else {
			System.out.println(primtall +" er ikke et primtall");
		}
	}
}