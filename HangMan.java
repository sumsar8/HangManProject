import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;



public class HangMan {
    public static void main(String[] args) {
        String randomword = pickarandomword();
    }

    private static String pickarandomword() {
        File myObj = new File("words.txt");
        Scanner myReader = new Scanner(myObj);
        while (myReader.hasNextLine()) {
            String Word = myReader.nextLine();
            System.out.println(Word);
        }
        return null;
    }
}
