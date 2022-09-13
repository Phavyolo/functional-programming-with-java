package programming;

import java.util.List;

public class FP01Functional {

	public static void main(String[] args) {
		
		printAllNumberInListFunctional(List.of(12,9,13,4,6,2,4,12,15));

	}
	
	private static void print(int number) {
		System.out.println(number);
	}

	private static void printAllNumberInListFunctional(List<Integer> numbers) {
		
		numbers.stream()
		.forEach(FP01Functional::print);  // Method Reference
		
	}

}
