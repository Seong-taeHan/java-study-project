package Collection;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

    public static void main(String[] args) {
        Map<Integer, String> hashMap = new HashMap<>();

        // 요소 추가
        hashMap.put(1, "a");
        hashMap.put(2, "b");
        hashMap.put(3, "c");

        // 요소 전체 출력
        System.out.println(hashMap);

        // 요소 접근 - key
        System.out.println(hashMap.get(1));

        // 요소 접근 - 예외처리
        System.out.println(hashMap.getOrDefault(5, "default"));

        // 요소 개수 확인
        System.out.println(hashMap.size());

        // 요소의 키 전체 출력 반환 타입 -> set
        System.out.println(hashMap.keySet());

        // 요소의 값 전체 출력 반환 타입 -> Collection
        System.out.println(hashMap.values());

        // 요소의 키, 값 전체 출력 반환 타입 -> set
        System.out.println(hashMap.entrySet());

        // 요소 전체 제거
        hashMap.clear();

        // 요소 비어있는지 확인 비어있다면 true 아니라면 false
        System.out.println(hashMap.isEmpty());
    }
}
