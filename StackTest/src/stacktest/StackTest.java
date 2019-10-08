/*
In the name of Allah, the Gracious, the Merciful
 */
package stacktest;

/**
 *
 * @author ibrahim
 */
public class StackTest {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		double[] doubleElements = {1.1, 2.2, 3.3, 4.4, 5.5};
		int[] integerElements = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		// create Stack<Double> and a Stack<Integer>
		Stack<Double> doubleStack = new Stack<>(5);
		Stack<Integer> integerStack = new Stack<>();
		
		testPushDouble(doubleStack, doubleElements);
		testPopDouble(doubleStack);
		
		testPushInteger(integerStack, integerElements);
		testPopInteger(integerStack);
	}
	
	private static void testPushDouble(
			Stack<Double> stack, double [] values){
		
		System.out.printf("%nPushing elements onto doubleStack%n");
			
		// push elements to stack
		for(double value : values){
			System.out.printf("%.1f", value);
			stack.push(value);
		}
		
	}
	
	private static void testPopDouble(Stack<Double> stack){
		try{
			System.out.printf("%nPoping elements from doubleStack%n");
			double popValue;
			
			// remove all elements from stack
			while(true){
				popValue = stack.pop();
				System.out.printf("%.1f", popValue);
			}
		}catch(EmptyStackException emptyStackException){
			System.err.println();
			emptyStackException.printStackTrace();
		}
	}
	
	private static void testPushInteger(
	Stack<Integer> stack, int[] values){
		System.out.printf("%nPushing elements onto integerStack%n");
		// push elements to stack
		for(int value : values){
			System.out.printf("%d ", value);
			stack.push(value);
		}
	}
	
	private static void testPopInteger(Stack<Integer> stack){
		try{
			System.out.printf("%nPoping elements from dintegerStack%n");
			int popValue;
			
			// remove all elements from stack
			while(true){
				popValue = stack.pop();
				System.out.printf("%d ", popValue);
			}
		}catch(EmptyStackException emptyStackException){
			System.err.println();
			emptyStackException.printStackTrace();
		}
	}
}
