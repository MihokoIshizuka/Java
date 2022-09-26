package paiza;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class paiza_enshu39 {
	// ファイルアクセス - try-with-resources
    public static void main(String[] args) {

        File file = new File("articles.txt");

        // ファイル書き込み
//      try()内にFileWriter=...を記述することで、書き込み用オブジェクトが自動でクローズする
        try(FileWriter filewriter = new FileWriter(file)) {
            filewriter.write("Hello world\n");
            filewriter.write("Hello Java\n");
        } catch (IOException e) {
            System.err.println("ファイル書き込みに失敗しました");
            e.printStackTrace();
        }

        // ファイル読み込み
        file = new File("error.txt");
        try(Scanner scan = new Scanner(file)) {
            while (scan.hasNextLine()) {
                String line = scan.nextLine();
                System.out.println(line);
            }
//      try()内にScanner scan=...を記述することで、読み込み用オブジェクトが自動でクローズする
        } catch (FileNotFoundException e) {
            System.err.println("ファイル読み込みに失敗しました");
            e.printStackTrace();
        }
    }
}
