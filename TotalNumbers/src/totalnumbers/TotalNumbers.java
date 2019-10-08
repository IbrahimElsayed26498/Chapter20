/*
In the name of Allah, the Gracious, the Merciful
 */
package totalnumbers;

import java.util.ArrayList;

/**
 *
 * @author ibrahim
 */
public class TotalNumbers {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		// create, initialize and output ArrayList of Numbers contining
		// both Integers and Doubles, then displayes total of the elements
		Number[] numbers = {1, 2.4, 3, 4.1};
		ArrayList<Number> numberList = new ArrayList<>();
		
		for(Number element : numbers){
			numberList.add(element);
		}
		
		System.out.printf("numberList contains: %s%n", numberList);
		System.out.printf("Total of elements in numberList: %.1f%n",
				sum(numberList));
	}
	
	// calculate total of ArrayList elements
	public static double sum(ArrayList<Number> list){
		double total = 0;
		
		// calculate sum
		for(Number element : list)
			total += element.doubleValue();
		
		return total;
	}
	
}
