package WordCount;
import java.io.*;
import java.lang.*;
public class main {
    private static final String FILE_PATH = "F:\\Java\\albert.txt";

    public static void main(String args[]) throws IOException {

        FileUtil fileUtil = new FileUtil(FILE_PATH);

        System.out.println("No. of words in file: " + fileUtil.getWordCount());

        FileUtil.read();

    }
}
