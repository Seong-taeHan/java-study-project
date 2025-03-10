package fileio;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterEx {

    public static void main(String[] args) {
        try(BufferedWriter bw = new BufferedWriter(new FileWriter("study2.txt"))){
            bw.write("Hello Spring");
            bw.newLine(); // 줄바꿈 가능
            bw.write("Hello Spring");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
