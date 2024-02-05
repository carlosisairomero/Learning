import java.util.List;

public class FP01 {
    public static void main(String[] args) {
        System.out.println("Structured:");
        printAllNumbersInListStructured(List.of(12, 9, 13, 4, 6, 2, 4, 12, 15));
        System.out.println("\nFunctional:");
        printAllNumbersInListFunctional(List.of(12, 9, 13, 4, 6, 2, 4, 12, 15));
    }

    private static void printAllNumbersInListStructured(List<Integer> numbers) {
        // How to loop the numbers?
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }

    private static void printAllNumbersInListFunctional(List<Integer> numbers) {
        // What to do?
        numbers.stream()
                .forEach(System.out::print);
    }
}



