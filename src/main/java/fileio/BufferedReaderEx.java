package fileio;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderEx {

    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new FileReader("study2.txt"))){
            String line;
            // 버퍼를 이용하기 때문에 한글자씩 가져오는 것이 아닌 한줄 씩 가져올 수 있음
            while ((line = br.readLine()) != null){
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
