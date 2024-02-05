import java.util.List;

public class FP04 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);
        List<String> courses = List.of("Spring", "Spring Boot", "API", "Microservices", "AWS", "PCF", "Azure", "Docker", "Kubernetes");

        System.out.println("E1: Print Squares of Even Numbers");
        printSquaresOfEvenNumbers(numbers);
        System.out.println("E2: Print Cubes of Odd Numbers");
        printCubesOfOddNumbers(numbers);
        System.out.println("E3: Print Number of Chars For Each Course");
        printNumberOfCharactersForEachCourse(courses);
    }

    private static void printSquaresOfEvenNumbers(List<Integer> numbers) {
        numbers.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * n)
                .forEach(System.out::println);
    }

    private static void printCubesOfOddNumbers(List<Integer> numbers) {
        numbers.stream()
                .filter(n -> n % 2 != 0)
                .map(n -> n * n * n)
                .forEach(System.out::println);
    }

    private static void printNumberOfCharactersForEachCourse(List<String> courses) {
        courses.stream()
                .map(c -> c + " " + c.length())
                .forEach(System.out::println);
    }

}






