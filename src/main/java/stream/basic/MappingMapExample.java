package stream.basic;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public class MappingMapExample {

    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("a", 1);
        hashMap.put("b", 2);
        hashMap.put("c", 3);

        // 익명 클래스를 활용한 매핑
        Function<Map.Entry<String, Integer>, String> mapping = new Function<Map.Entry<String, Integer>, String>() {
            @Override
            public String apply(Map.Entry<String, Integer> entry) {
                return entry.getKey() + " : " + entry.getValue();
            }
        };

        // 익명클래스를 사용한 매핑 예제
        hashMap.entrySet().stream()
                .map(mapping)
                .forEach(System.out::println);

        // 람다를 사용한 매핑 예제
        hashMap.entrySet().stream()
                .map(entry -> entry.getKey() + " : " + entry.getValue())
                .forEach(System.out::println);
    }
}
