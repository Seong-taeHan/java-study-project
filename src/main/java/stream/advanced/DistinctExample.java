package stream.advanced;

import java.util.Arrays;
import java.util.List;

public class DistinctExample {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("a", "b", "a", "c", "b", "a", "c");

        // distinct - 중복 제거
        list.stream()
                .distinct()
                .forEach(System.out::println);
    }
}
