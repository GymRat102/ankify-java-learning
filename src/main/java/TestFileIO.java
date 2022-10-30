import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class TestFileIO {

    public static void main(String[] args) throws FileNotFoundException {

        // read a file
        Scanner in = new Scanner(new File("myfile.txt"), "UTF-8");
        String line = in.nextLine();
        System.out.println(line);

        // write into a file
        PrintWriter out = new PrintWriter(new File("myfile.txt"));
        out.write("next line");
        out.flush();
    }
}
