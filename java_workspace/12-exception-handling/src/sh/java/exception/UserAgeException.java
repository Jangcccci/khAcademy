package sh.java.exception;

/**
 * 
 * Checked Exception 예외처리 강제화 extends Exception
 * UnChecked Exception 예외처리 강제화하지는 않음. extends RuntimeException
 * 
 * 
 * @author jangcccci
 *
 */
public class UserAgeException extends RuntimeException {

	public UserAgeException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserAgeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public UserAgeException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public UserAgeException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public UserAgeException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

	
}
