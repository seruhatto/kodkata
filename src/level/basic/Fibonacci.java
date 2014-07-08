package level.basic;

public class Fibonacci {

	/**
	 * n=0 ; 0 </br> F(n) = {n=1 ; 1 </br> n>1 ; F(n-1) + F(n-2)
	 * 
	 */

	public static int fibonacci(int deger) {
		if (deger < 0) {
			throw new RuntimeException("Negatif Deðer");
		} else if (deger < 2) {
			return deger;
		} else {
			return fibonacci(deger - 1) + fibonacci(deger - 2);
		}
	}

	public static void main(String[] args) {
		System.out.println(fibonacci(10));
	}
}
