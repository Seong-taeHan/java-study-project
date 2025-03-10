package fileio;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderEx {

    public static void main(String[] args) {

        // 파일을 읽기 위해 예외처리(IOException) 필요
        try (FileReader fr = new FileReader("example.txt")) {
            int data;
            // 글자를 하나씩 불러와 -1이 될때까지 출력
            // -1은 파일의 내용의 끝을 의미함
            while ((data = fr.read()) != -1) {
                System.out.print((char) data); // 읽은 문자를 출력
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
