package stream.advanced;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class CollectExample {

    public static void main(String[] args) {

        // list -> set 변환
        List<String> list = Arrays.asList("a", "b", "c", "d", "e", "a");

        Set<String> toSet = list.stream()
                .collect(Collectors.toSet());
        System.out.println(toSet);

        // joining
        String join = list.stream()
                .collect(Collectors.joining(", "));

        System.out.println(join);
    }
}
