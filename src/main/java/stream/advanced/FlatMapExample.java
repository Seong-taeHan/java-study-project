package stream.advanced;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapExample {

    public static void main(String[] args) {
        List<List<String>> nestedList =  Arrays.asList(
                Arrays.asList("a", "b"),
                Arrays.asList("c"),
                Arrays.asList("d", "e")
        );
        // flatmap -> 다차원 구조를 1차원 스트림으로 평면화 하는 중간연산
        List<String> flatMap = nestedList.stream()
                // .flatMap(s -> s.stream())
                .flatMap(Collection::stream)
                .collect(Collectors.toList());

        System.out.println(flatMap);
    }
}
