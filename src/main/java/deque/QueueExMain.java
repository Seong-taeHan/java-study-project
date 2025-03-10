package deque;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExMain {

    public static void main(String[] args) {
        // 큐 인스턴스 생성
        Queue<Integer> queue = new LinkedList<>();

        // offer 큐의 뒤쪽에 요소 삽입
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);

        // 전체 출력
        System.out.println(queue);

        // 큐 앞쪽의 요소를 반환(반환시 요소 삭제)
        queue.poll();

        // peek 맨 앞의 요소 하나 반환(요소 삭제 안함)
        System.out.println(queue.peek());
    }
}
