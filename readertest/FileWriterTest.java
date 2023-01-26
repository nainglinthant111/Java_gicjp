package readertest;

import java.io.*;

public class FileWriterTest {
    public static void main(String[] args) throws IOException {
        FileWriter fw=new FileWriter("writeme.txt");
        BufferedWriter bw=new BufferedWriter(fw);
        PrintWriter output=new PrintWriter(bw);
        output.close();
        bw =new BufferedWriter(new FileWriter("writeme.txt",true));
        output=new PrintWriter(bw);
        output.println("And I'm the second one.");
        double b=123.45;
        output.println(bw);
        output.println("hi i am third one");
        output.close();

    }
}
