package mvc1;

import mvc1.controller.JFrameViewController;
import mvc1.view.JFrameView;

/**
 * Wszystko zaczyna się tutaj.
 * Ta klasa aplikacji ma jedynie zainicjować wszystkie komponenty i wystartować procesy/taski
 *
 * Na końcu rzuć jeszcze okiem do pliku README.md
 */
public class App {

    private JFrameView view;
    private JFrameViewController controller;

    /**
     * Zwróć uwagę, że całkowicie odseparowałem logikę inicjalizacji klasy oraz
     * komponentów od wykonania logiki. Stąd pojawiła się metoda run.
     */
    private App() {
        this.view = new JFrameView();
        this.controller = new JFrameViewController(this.view);
    }

    public static void main(String[] args) {
        new App().run();
        System.exit(0);
    }

    private void run() {
        controller.runMultiplicationTask();
    }

}
