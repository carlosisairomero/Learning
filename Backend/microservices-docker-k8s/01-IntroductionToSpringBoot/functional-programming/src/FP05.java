import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class FP05 {
    public static void main(String[] args) {
        List<String> fruits = List.of("apple", "banana", "mango");
        // I want the first fruit that starts with a "b"
        Predicate<? super String> predicate = f -> f.startsWith("c");
        Optional<String> firstWithB = fruits.stream().filter(predicate).findFirst();
        System.out.println(firstWithB);
        System.out.println(firstWithB.isEmpty());
        System.out.println(firstWithB.isPresent());
        System.out.println(firstWithB.get());
    }
}






