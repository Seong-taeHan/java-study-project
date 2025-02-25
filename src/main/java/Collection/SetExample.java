package Collection;

import java.util.HashSet;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {
        // hashSet 인스턴스 생성
        Set<String> setList =  new HashSet<>();

        // 요소 추가
        setList.add("a");
        setList.add("b");
        setList.add("c");

        // 중복 요소가 들어갈 경우 덮어 씌워짐
        setList.add("a");

        // 요소 전체 출력
        System.out.println(setList);

        // 요소 존재 여부 확인 -> true or false 반환
        System.out.println(setList.contains("b"));

        // 요소 삭제 setList.remove()
        setList.remove("b");

        System.out.println(setList.contains("b"));

        // 개수 확인
        System.out.println(setList.size());

        // 요소 전체 제거
        setList.clear();

        // 요쇼 비어있는지 확인 비어있다면 true 아니라면 false
        System.out.println(setList.isEmpty());
    }
}
