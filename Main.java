package lessons.javaCore.stream1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        List<Integer> positiveNumbers = sortByPositiveNumbers(numbers); //получили положительные числа
        List<Integer> evenNumbers = sortByEvenNumbers(positiveNumbers); //получили четные числа
        Collections.sort(evenNumbers); //отсортировали
        System.out.println(evenNumbers);
    }

    public static ArrayList<Integer> sortByPositiveNumbers (List<Integer> numbers) {
        ArrayList <Integer> positiveNumbers = new ArrayList<>();
        for (Integer num : numbers) {
            if (num >= 0) positiveNumbers.add(num);
        }
        return positiveNumbers;
    }
    public static ArrayList<Integer> sortByEvenNumbers (List<Integer> numbers) {
        ArrayList <Integer> evenNumbers = new ArrayList<>();
        for (Integer num : numbers) {
            if (num % 2 == 0) evenNumbers.add(num);
        }
        return evenNumbers;
    }
}
