package fileReader;
import java.io.File;
import java.io.FileWriter; 
import java.io.IOException; 
import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args) throws IOException {
        //http://textfiles.com/100/captmidn.txt
        File file = new File("/Users/tamilselvans/Desktop/Java-program/project/src/fileReader/text.txt");
        Scanner sc = new Scanner(file);
        String fileContent = "";
        while(sc.hasNextLine()) {
            fileContent = fileContent.concat(sc.nextLine() + "\n");
        }
        FileWriter writer = new FileWriter("/Users/tamilselvans/Desktop/Java-program/project/src/fileReader/newfile1.txt");
        writer.write(fileContent);
        writer.close();
        sc.close();
    }

}
