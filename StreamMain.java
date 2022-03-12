package lessons.javaCore.stream1;

import java.util.Arrays;
import java.util.List;

public class StreamMain {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        numbers.stream()
                .filter(x -> x > 0)
                .filter(x -> x % 2 == 0)
                .sorted()
                .map(x -> x + " ")
                .forEach(System.out::print);
    }
}
