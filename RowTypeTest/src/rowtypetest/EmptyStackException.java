/*
In the name of Allah, the Gracious,s the Merciful
 */
package rowtypetest;

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

