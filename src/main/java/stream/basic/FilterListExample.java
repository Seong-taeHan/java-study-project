package stream.basic;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class FilterListExample {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("a");
        list.add("b");
        list.add("c");

        // 익명 클래스를 이용한 필터링
        // Predicate -> 매개변수를 받아 boolean 값을 반환하는 함수형 인터페이스
        Predicate<String> isA = new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.equals("a");
            }
        };

        // 익명클래스를 사용한 필터링 예제
        list.stream()
                .filter(isA)
                .forEach(System.out::println);

        // 람다를 사용한 필터링 예제
        list.stream()
                .filter(s ->  s.equals("a")) //
                .forEach(s ->  System.out.println(s));
    }
}
