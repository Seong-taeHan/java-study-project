package Collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        // ArrayList객체 생성
        List<String> list = new ArrayList<>();

        // 요소 추가
        list.add("a");
        list.add("b");
        list.add("c");

        // 요소 전체 출력
        System.out.println(list);

        // 요소 접근 -> list.get(int index)
        System.out.println(list.get(1));

        // 요소 존재 여부 확인 ture or false 반환
        System.out.println(list.contains("b"));

        // 요소 삭제 list.remove(int index) or list.remove(Object o)
        list.remove(0);
        // 객체 사용 시 boolean 타입 리턴
        System.out.println(list.remove("b"));

        System.out.println(list);

        System.out.println(list.contains("b"));

        // 개수 확인
        System.out.println(list.size());

        // 요소 전체 제거
        list.clear();
        // 요소 비어있는지 확인 비어있다면 true 아니라면 false
        System.out.println(list.isEmpty());
    }
}
