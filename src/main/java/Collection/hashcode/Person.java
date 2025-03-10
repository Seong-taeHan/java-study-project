package Collection.hashcode;

import java.util.Random;

public class Person {
    Random rand = new Random();

    String name;

    Person(String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        // 버킷의 크기를 제한하여 버킷을 인덱스로 관리하는 방법
        // int randomInt = rand.nextInt();
        // System.out.println(randomInt);
        // return randomInt % 10 ;

        // 여기선 HashSetEx의 버킷 위치를 고정적으로 사용하기 위해 hashCode를 고정으로 반환
        return 42;
    }

    // hash Collision 발생 시 수행 로직
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Person person = (Person) obj;
        return this.name.equals(person.name);
    }

    @Override
    public String toString() {
        return name;
    }
}
