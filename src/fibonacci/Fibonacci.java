package fibonacci;

public class Fibonacci {

	public static final int MAX_LIMIT = 46;

	/**
	 * n=0 ; 0 </br> F(n) = {n=1 ; 1 </br> n>1 ; F(n-1) + F(n-2)
	 * 
	 * @throws NegativeValueException
	 * 
	 */

	public static int calculate(int deger) throws NegativeValueException {
		if (deger < 0) {
			throw new NegativeValueException();
		} else if (deger < 2) {
			return deger;
		} else if (deger > MAX_LIMIT) {
			throw new MaxLimitException();
		} else {
			return calculate(deger - 1) + calculate(deger - 2);
		}
	}

}
