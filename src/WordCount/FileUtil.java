package WordCount;
import java.io.*;
import java.lang.*;
class FileUtil {

    static BufferedReader reader = null;

    public FileUtil(String filePath) throws FileNotFoundException {

        File file = new File(filePath);

        FileInputStream fileStream = new FileInputStream(file);

        InputStreamReader input = new InputStreamReader(fileStream);

        reader = new BufferedReader(input);

    }

    public static int getWordCount() throws IOException {

        int wordCount = 0;

        String data;

        while((data = reader.readLine()) != null){

            // \\s+ means space between two words

            String[] words = data.split("\\s+");

            wordCount += words.length;

        }

        return wordCount;

    }

    public static void read() throws IOException {

        FileInputStream fis = new FileInputStream("wordcount.txt");

        FileOutputStream fos = new FileOutputStream("results.txt");

        int b;

        while  ((b=fis.read()) != -1)

            fos.write(b);

        fis.close();

        fos.close();

    }

}
	
