package Collection.hashcode;

import java.util.HashSet;

public class HashSetEx {

    public static void main(String[] args) {
        HashSet<Person> set = new HashSet<>();

        Person p1 = new Person("Kim");
        Person p2 = new Person("Lee");
        Person p3 = new Person("Park");
        Person p4 = new Person("Lee");

        // p1 객체를 hashcode 42로 변환
        // hashCode 42에 해당하는 Bucket의 위치에 값이 없으므로 저장
        // Bucket | Node
        //   42   |  p1
        set.add(p1);

        // p2 객체를 hashCode 42로 변환
        // hashCode 42에 해당하는 Bucket의 위치에 값이 이미 존재함 → hash 충돌 발생
        // equals()로 값이 같은지 확인 → 값이 다름 → 별도의 노드로 저장 (체이닝 방식)
        // Bucket |   Node
        //   42   | p1 -> p2
        set.add(p2);

        // p2의 과정을 반복
        // Bucket |      Node
        //   42   | p1 -> p2 -> p3
        set.add(p3);

        // p4 객체를 hashCode 42로 변환
        // hashCode 42에 해당하는 Bucket의 위치에 값이 이미 존재함 → hash 충돌 발생
        // Bucket |      Node
        //   42   | p1 -> p2 -> p3
        // 42 버킷 인덱스에 p1과 값이 일치하는지 확인 false
        // 42 버킷 인덱스에 p2와 값이 일치하는지 확인 true
        // 값을 저장하지 않고 로직을 종료
        set.add(p4);

        System.out.println(set);
    }
}
