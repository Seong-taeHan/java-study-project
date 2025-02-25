package stream.basic;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Predicate;

public class FilterMapExample {

    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("a", 1);
        hashMap.put("b", 2);
        hashMap.put("c", 3);

        // 익명 클래스를 이용한 필터링
        // Map.Entry<String, Integer> ->
        Predicate<Map.Entry<String, Integer>> predicate = new Predicate<Map.Entry<String, Integer>>() {
            @Override
            public boolean test(Map.Entry<String, Integer> entry) {
                return entry.getValue() > 1;
            }
        };

        // Map 객체를 리스트 객체로 바꿔주어야 stream을 사용할 수 있음
        // 익명 클래스를 사용한 필터링 예제
        hashMap.entrySet().stream()
                .filter(predicate)
                .forEach(System.out::println);

        // 람다를 사용한 필터링 예제
        hashMap.entrySet().stream()
                .filter(entry -> entry.getValue() > 1)
                .forEach(entry -> System.out.println(entry.getKey() + " : " + entry.getValue()));
    }
}
