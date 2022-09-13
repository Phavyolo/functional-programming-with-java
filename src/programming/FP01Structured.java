package programming;

import java.util.List;

public class FP01Structured {

	public static void main(String[] args) {
		
		printAllNumberInListStructured(List.of(12,9,13,4,6,2,4,12,15));

	}

	private static void printAllNumberInListStructured(List<Integer> numbers) {
		
		// How to loop the number? 
		// -- structured is always focused on the HOW.
		for(int number: numbers) {
			System.out.println(number);
		}
		
	}

}
