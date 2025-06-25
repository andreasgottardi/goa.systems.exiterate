package goa.systems;

public class QueueEmptyException extends Exception {

	private static final long serialVersionUID = 1L;

	public QueueEmptyException(String message) {
		super(message);
	}
}
