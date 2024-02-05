import java.util.List;

public class FP02 {
    public static void main(String[] args) {
        System.out.println("Structured:");
        printEvenNumbersInListStructured(List.of(12, 9, 13, 4, 6, 2, 4, 12, 15));
        System.out.println("\nFunctional:");
        printEvenNumbersInListFunctional(List.of(12, 9, 13, 4, 6, 2, 4, 12, 15));
    }

    private static void printEvenNumbersInListStructured(List<Integer> numbers) {
        // How to do?
        for (int number : numbers) {
            if(number % 2 == 0) {
                System.out.println(number );
            }
        }
    }

    private static void printEvenNumbersInListFunctional(List<Integer> numbers) {
        // What to do?
        numbers.stream()
                .filter(n -> n % 2 == 0)
                .forEach(System.out::println);
    }
}






