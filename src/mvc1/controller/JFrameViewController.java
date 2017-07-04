package mvc1.controller;

import mvc1.model.NumberInputDTO;
import mvc1.model.ScoreOutputDTO;
import mvc1.service.TrivialCalculator;
import mvc1.view.JFrameView;

/**
 * Kontroler. Jednym z jego pól jest oczywiście widok.
 * Jego zadaniem jest kontrolowanie widoku (you no say),
 * tak aby zachowywał się zgodnie z oczekiwaniami.
 */
public class JFrameViewController {

    private JFrameView view;

    /**
     * Logika businessowa została wyniesiona niżej, do klasy serwisu.
     */
    private TrivialCalculator calculator;

    public JFrameViewController(JFrameView view) {
        this.view = view;
        this.calculator = new TrivialCalculator();
    }

    /**
     * Zwróć uwagę na to, że nazwy metod stanowią również ich dokumentację.
     */
    public void runMultiplicationTask() {
        NumberInputDTO n1 = view.showInputPane("Podaj pierwszą liczbę");
        NumberInputDTO n2 = view.showInputPane("Podaj drugą liczbę");

        Integer result = calculator.multiply(n1.getValue(), n2.getValue());
        ScoreOutputDTO out = new ScoreOutputDTO("Wynik mnożenia podanych liczb to: ", result);

        view.showMessagePane(out);
    }

}
