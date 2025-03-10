package deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeStackExMain {

    public static void main(String[] args) {
        // Deque<Integer> 타입의 ArrayDeque<>()인스턴스 생성
        Deque<Integer> dequeStack = new ArrayDeque<>();

        // push 요소를 맨 앞에 저장
        dequeStack.push(3);
        dequeStack.push(2);
        dequeStack.push(1);

        // 데크 전체 출력
        System.out.println(dequeStack);

        // pop 가장 앞에 저장된 요소를 삭제 및 반환
        System.out.println(dequeStack.pop());
        System.out.println(dequeStack);

        System.out.println(dequeStack.pop());
        System.out.println(dequeStack);

        System.out.println(dequeStack.pop());
        System.out.println(dequeStack);
    }
}
