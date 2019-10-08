/*
In the name of Allah, the Gracious,s the Merciful
 */
package stacktest2;

/**
 *
 * @author ibrahim
 */
public class EmptyStackException extends RuntimeException{
	public EmptyStackException(){
		this("Stack is empty");
	}
	
	public EmptyStackException(String message){
		super(message);
	}
}

