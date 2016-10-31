package fibonacci;

public class NegativeValueException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public NegativeValueException() {
		super("Negative Value");
	}
}
