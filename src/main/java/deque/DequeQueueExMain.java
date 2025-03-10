package deque;

import java.util.Deque;
import java.util.LinkedList;

public class DequeQueueExMain {

    public static void main(String[] args) {
        // 데크<Integer> 타입의 LinkedList 인스턴스 생성
        Deque<Integer> deque = new LinkedList<>();

        // addFirst 데크의 맨앞에 요소를 추가
        deque.addFirst(2);

        deque.addFirst(1);

        System.out.println(deque);

        // addLast 데크의 뒤에 요소를 추가
        deque.addLast(3);

        System.out.println(deque);

        // 데크의 맨 앞 요소를 삭제
        System.out.println(deque.removeFirst());

        // 데크의 맨 뒤의 요소를 삭제
        System.out.println(deque.removeLast());
    }
}
