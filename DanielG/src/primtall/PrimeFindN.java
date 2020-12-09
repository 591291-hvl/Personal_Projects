package primtall;

public class PrimeFindN {
	
	//potensiell bedre program er å kun sjekke delelighet på primtall
	//det eller ekskludere delelighet på tall som slutter på noe annet enn 1,3,7,9
	public static void main(String[] args) {

		long start = System.currentTimeMillis();
		
//		long N = (long) (Math.pow(2, 61))-1;
		int N = 82589933;
		
		System.out.println("Prime to find : " + N);

//		System.out.println(findPrime(N));
		System.out.println(findIfPrime(N));

		
		long end = System.currentTimeMillis();
		long elapsedTime = end - start;
		System.out.println(elapsedTime/1000.0 + " seconds");
	}
//finds prime highest prime to n
//slow, boring, stupid
	public static int findPrime(int n) {
		int counter = 0;
		int prime = 0;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					counter++;
					if (counter > 2) {
						break;
					}
				}
			}
			if (counter == 2) {
				prime = i;
			}
			counter = 0;
		}
		return prime;
	}
//find if n is prime
//fast, instant, cool, dumb
	public static boolean findIfPrime(int n) {
		int counter = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				counter++;
				if(counter > 2) {
					return false;
				}
			}
		}
		return true;
	}

}
