package programming;

import java.util.List;

public class FP01Functional {

	public static void main(String[] args) {
		
		List<Integer> numbers = List.of(12,9,13,4,6,2,4,12,15);
		
//		printAllNumberInListFunctional(numbers);
		
		printEvenNumberInListFunctional(numbers);
		

	}
	
//	private static void print(int number) {
//		System.out.println(number);
//	}
	
//	private static boolean isEven(int number) {
//		return number%2 == 0;
//	}

	private static void printAllNumberInListFunctional(List<Integer> numbers) {
		//What to do?
		numbers.stream()
		.forEach(System.out::println);  // Method Reference
	}
	
	private static void printEvenNumberInListFunctional(List<Integer> numbers) {
		//What to do?
		numbers.stream() //Stream is a sequence of elements
			//.filter(FP01Functional::isEven) //Filter - Only Allow Even Numbers
			.filter(number -> number%2 == 0)// Lambda Expression
			.forEach(System.out::println);  // Method Reference
		
	}

}
