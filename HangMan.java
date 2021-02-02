import javax.swing.*;
import java.util.Arrays;


public class HangMan {
    public static void main(String[] args) {

        int correctguesses = 0;
        String answer;
        String[] randomwords = {"oga", "ploppsie", "ogabobpsie"};

        answer = randomwords[(int)(Math.random()*randomwords.length)];
        System.out.println(answer);

        char[] characters = new char[answer.length()];

        for(int i = 0; i <= answer.length() - 1; i++){
            characters[i] = answer.charAt(i);
        }

        boolean isrunning = true;
        while (isrunning){
        String playerguess = JOptionPane.showInputDialog("What is your guess?");
        char playerguesschar = playerguess.charAt(0);


        for(int i = 0; i <= answer.length() - 1; i++){
        if(playerguesschar == answer.charAt(i)) {
            JOptionPane.showMessageDialog(null, answer.charAt(i));
            correctguesses++;
            System.out.println(correctguesses);
        if(correctguesses == answer.length()){
            isrunning = false;
            }
        }
            }
        }
    }
}