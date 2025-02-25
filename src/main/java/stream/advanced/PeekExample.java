package stream.advanced;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PeekExample {

    public static void main(String[] args) {
        List<String> items = Arrays.asList("a", "b", "c", "d", "e");

        // 중간연산 체크
        List<String> Ascii = items.stream()
                .peek(System.out::println)
                // a의 아스키 코드는 97
                .filter(item -> item.charAt(0) > 98)
                .peek(System.out::println)
                .toList();

        Ascii.forEach(System.out::print);

    }
}
