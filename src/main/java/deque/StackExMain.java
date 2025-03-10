package deque;

import java.util.Stack;

public class StackExMain {

    public static void main(String[] args) {
        // stack 인스턴스 생성
        Stack<Integer> stack = new Stack<>();
        // push : 맨 위에 요소를 저장
        stack.push(3);
        stack.push(2);
        stack.push(1);

        // 스택 요소를 전체 출력
        System.out.println(stack);

        // pop : 스택의 맨 위에 씨는 요소를 출력
        System.out.println(stack.pop());

        // 다음으로 튀어나올(스택의 맨 위에 있는) 요소 1개를 출력
        System.out.println(stack.peek());

        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}

