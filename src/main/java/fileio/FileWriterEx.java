package fileio;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterEx {
    public static void main(String[] args) {

        // 파일을 쓰기 위해 예외처리(IOException) 필요
        // 파일 생성 및 열기
        try (FileWriter fw = new FileWriter("study.txt")) {
            // 파일에 작성될 내용
            fw.write("Hello Spring");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

