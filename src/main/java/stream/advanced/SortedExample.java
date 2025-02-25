package stream.advanced;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortedExample {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 4, 7, 6, 2, 3, 1);

        // sorted - 오름차순 정렬
        numbers.stream()
                .sorted()
                .forEach(System.out::println);

        // sorted - 내림차순 정렬
        numbers.stream()
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);

        // 문자열 길이 정렬
        List<String> citis = Arrays.asList("Seoul", "Busan", "Gwangju", "Jeju island");
        citis.stream()
                .sorted(Comparator.comparing(String::length))
                .forEach(System.out::println);
    }
}
