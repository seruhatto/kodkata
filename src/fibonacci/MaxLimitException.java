package fibonacci;

public class MaxLimitException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public MaxLimitException() {
		super("Maximum Value is "+Fibonacci.MAX_LIMIT+" that can be calculated");
	}
}
