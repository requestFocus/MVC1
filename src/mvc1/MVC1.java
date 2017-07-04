
package mvc1;

import java.awt.*;
import javax.swing.*;

public class MVC1 {

    public static void main(String[] args) {
        new MVC1();
    }

    public MVC1() {
        JFrame frame = initializeFrame();
        int[] numbersLoaded = getNumbers(frame);
        presentNumbers(numbersLoaded);
        int score = calculateNumbers(numbersLoaded);
        presentScore(score);
        frame.dispose();
    }

//====================== V I E W =====    
    private JFrame initializeFrame() {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(3);
        frame.setVisible(true);
        return frame;
    }
    
    private void presentNumbers(int[] numbers) {
        System.out.println("Podano liczby: " + numbers[0] + " oraz " + numbers[1]);
    }
    
    private void presentScore(int score) {
        System.out.println("Wynik mnożenia podanych liczb to: " + score);
    }
    
//======================= C O N T R O L L E R    
    private int[] getNumbers(JFrame frame) {
        int[] numbers = new int[2];
        String firstNumber = JOptionPane.showInputDialog(frame, "Podaj pierwszą liczbę");
        String secondNumber = JOptionPane.showInputDialog(frame, "Podaj drugą liczbę");
        numbers[0] = Integer.valueOf(firstNumber);
        numbers[1] = Integer.valueOf(secondNumber);
        return numbers;
    }
 
//======================== M O D E L
    private int calculateNumbers(int[] numbers) {
        int multipliedValue = numbers[0] * numbers[1];
        return multipliedValue;
    }
}
