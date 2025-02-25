package stream.basic;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class MappingListExample {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("a");
        list.add("b");
        list.add("c");

        // 익명클래스를 활용한 매핑
        // Fuction -> 매개변수와 반환값을 받아 입력값을 반환값으로 가공하여 반환
        Function<String, Integer> length = new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                return s.length();
            }
        };

        // 익명클래스를 사용한 매핑 예제
        list.stream()
                .map(length)
                .forEach(System.out::println);

        // 람다를 사용한 매핑 예제
        list.stream()
                .map(s -> s.length())
                .forEach(System.out::println);
    }
}
