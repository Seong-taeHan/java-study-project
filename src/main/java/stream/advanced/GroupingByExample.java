package stream.advanced;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingByExample {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("a1", "a2", "a3", "b1", "b2", "b3", "c1", "c2", "c3");

        Map<Character, List<String>> elements = list.stream()
                .collect(Collectors.groupingBy(element -> element.charAt(0)));

        elements.forEach((key, value) -> {
            System.out.println(key + " = " + value);
        });
    }
}
