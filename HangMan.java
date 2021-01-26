import javax.swing.*;
import java.util.Arrays;


public class HangMan {
    public static void main(String[] args) {

        String answer;
        String[] randomwords = {"oga", "ploppsie", "ogabobpsie"};

        answer = randomwords[(int)(Math.random()*randomwords.length)];
        System.out.println(answer);

        char playerguess;
        char[] characters = new char[answer.length()];
        for(int i = 0; i <= answer.length() - 1; i++){
            characters[i] = answer.charAt(i);
        }
        JOptionPane.showInputDialog(Arrays.toString(characters));

    }
}
