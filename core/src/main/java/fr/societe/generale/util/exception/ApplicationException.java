package fr.societe.generale.util.exception;

/**
 * 
 * @author mbarki 5 févr. 2018 
 *
 */
public class ApplicationException extends Exception {

	
	/**
	 * <p>Constructor for ApplicationException.</p>
	 *
	 * @param message a {@link java.lang.String} object.
	 * @param cause a {@link java.lang.Throwable} object.
	 */
	public ApplicationException(String message, Throwable cause){
		super(message,cause);
	}
	
	/**
	 * <p>Constructor for ApplicationException.</p>
	 *
	 * @param message a {@link java.lang.String} object.
	 */
	public ApplicationException(String message){
		super(message);
	}

}
