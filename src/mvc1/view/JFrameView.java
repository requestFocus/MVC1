package mvc1.view;

import mvc1.model.NumberInputDTO;
import mvc1.model.ScoreOutputDTO;
import mvc1.utils.Logger;

import javax.swing.*;

/**
 * To jest klasa widoku.
 * Aby zachować prawidłowe relacje MVC, wymiana informacji pomiędzy widokiem a kontrolerem
 * oparta jest na klasach modelu - DTO's (Data Transfer Objects)
 */
public class JFrameView {
    private JFrame frame;

    public JFrameView() {
        this.frame = initializeFrame();
    }

    private JFrame initializeFrame() {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(3);
        frame.setVisible(true);
        return frame;
    }

    /**
     * Prosta metoda zawierająca logikę wyświetlenia wiadomości
     * i przechwycenia liczmy. Nic więcej.
     *
     * !!!Zwraca model.
     */
    public NumberInputDTO showInputPane(String message) {
        Logger.log("message: " + message);
        String value = JOptionPane.showInputDialog(frame, message);
        Logger.log("acquired: " + value);
        return new NumberInputDTO(value);
    }

    /**
     * Jeszcze prostsza metoda. Wyświetlamy wiadomość i prezentujemy liczbę.
     * Za to model jest trochę bardziej skomplikowany.
     *
     * !!!Konsumuje model.
     */
    public void showMessagePane(ScoreOutputDTO result) {
        String message = result.getMessage() + result.getValue();
        Logger.log("message: " + message);
        JOptionPane.showMessageDialog(frame, message);
    }

}
