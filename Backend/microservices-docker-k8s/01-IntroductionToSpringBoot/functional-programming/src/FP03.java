import java.util.List;

public class FP03 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);
        List<String> courses = List.of("Spring", "Spring Boot", "API", "Microservices", "AWS", "PCF", "Azure", "Docker", "Kubernetes");

        System.out.println("E1: Print Only Odd Numbers");
        printOddNumbers(numbers);
        System.out.println("E2: Print Courses containing the word Spring");
        printCoursesThatContainsWordSpring(courses);
        System.out.println("E3: Print Courses with at least 4 letters");
        printCoursesWhoseNameHasAtLeast4Letters(courses);
    }

    private static void printOddNumbers(List<Integer> numbers) {
        numbers.stream()
                .filter(n -> n % 2 != 0)
                .forEach(System.out::println);
    }

    private static void printCoursesThatContainsWordSpring(List<String> courses) {
        courses.stream()
                .filter(c -> c.contains("Spring"))
                .forEach(System.out::println);
    }

    private static void printCoursesWhoseNameHasAtLeast4Letters(List<String> courses) {
        courses.stream()
                .filter(c -> c.length() >= 4)
                .forEach(System.out::println);
    }
}






