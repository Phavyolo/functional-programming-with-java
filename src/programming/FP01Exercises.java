package programming;

import java.util.List;

public class FP01Exercises {

	public static void main(String[] args) {
		
		List<Integer> numbers = List.of(12,9,13,4,6,2,4,12,15);
		
		List<String> courses = List.of("Spring", "Spring Boot", "API", "Microservices",
				"AWS", "PCF", "Azure", "Docker", "Kubernetes");

		
//		printOddNumberInListFunctional(numbers);
		
//		printAllCoursesInListFunctional(courses);
		
//		printCoursesContainingSpringInListFunctional(courses);
		
//		printCoursesWithAt4LettersInListFunctional(courses);
		
//		printCubeOfOddNumberInListFunctional(numbers);
		
		printNumberOfCharacteresInCourseInListFunctional(courses);

	}
	
	
	private static void printOddNumberInListFunctional(List<Integer> numbers) {
		numbers.stream()
		.filter(number -> number%2 == 1) 
		.forEach(System.out::println);
		
	}
	
	private static void printAllCoursesInListFunctional(List<String> courses) {
		courses.stream()
		.forEach(System.out::println);
	}
	
	private static void printCoursesContainingSpringInListFunctional(List<String> courses) {
		courses.stream()
		.filter(course -> course.contains("Spring"))
		.forEach(System.out::println); 
	}
	
	private static void printCoursesWithAt4LettersInListFunctional(List<String> courses) {
		courses.stream()
		.filter(course -> course.length() >= 4)
		.forEach(System.out::println);
	}
	
	private static void printCubeOfOddNumberInListFunctional(List<Integer> numbers) {
		numbers.stream()
		.filter(number -> number%2 != 0) 
		.map(number -> number * number * number)
		.forEach(System.out::println);
		
	}
	
	private static void printNumberOfCharacteresInCourseInListFunctional(List<String> courses) {
		courses.stream()
		.map(course -> course + " " + course.length())
		.forEach(System.out::println);
	}

}
