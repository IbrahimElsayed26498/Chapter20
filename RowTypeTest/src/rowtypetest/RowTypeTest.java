/*
In the name of Allah, the Gracious, the Merciful
 */
package rowtypetest;

/**
 *
 * @author ibrahim
 */
public class RowTypeTest {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		Double[] doubleElements = {1.1, 2.2, 3.3, 4.4, 5.5};
		Integer[] integerElements = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

		// Stack of raw types assigned to Stack of raw types variable
		Stack rawTypeStack1 = new Stack(5);

		// Stack<Double> assigned to Stack of raw types variable
		Stack rawTypeStack2 = new Stack<Double>(5);
		
		// Stack of raw type assigned to Stack<Integer>
		Stack<Integer> integerStack = new Stack(10);
		
		testPush("rawTypeStack1", rawTypeStack1, doubleElements);
		testPop("rawTypeStack1", rawTypeStack1);
		testPush("rawTypeStack2", rawTypeStack2, doubleElements);
		testPop("rawTypeStack2", rawTypeStack2);
		testPush("integerStack", integerStack, integerElements);
		testPop("integerStack", integerStack);

	}

	// generic method pushes elements onto stack
	public static <T> void testPush(String name, Stack<T> stack,
			T[] elements) {
		System.out.printf("%nPushing elements onto %s%n", name);

		// push elements onto stack
		for (T element : elements) {
			System.out.printf("%s ", element);
			stack.push(element);
		}
	}

	// generic method testPop pops elements from Stack
	public static <T> void testPop(String name, Stack<T> stack) {
		// pop element from stack
		try {
			System.out.printf("%nPoping elements from %s%n", name);
			T popValue;

			// remove elements from stack
			while (true) {
				popValue = stack.pop();
				System.out.printf("%s ", popValue);
			}
		} catch (EmptyStackException emptyStackException) {
			System.out.println();
			emptyStackException.printStackTrace();
		}
	}

}
