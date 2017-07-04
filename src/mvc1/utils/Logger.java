package mvc1.utils;

/**
 * W przyszłości będziesz korzystał z gotowych bibliotek logowania.
 * Zrobiłem tą klasę po to, aby Ci pokazać,
 * że powtarzalne części kodu warto wynosić do klas pomocniczych.
 * Poprawia to czytelność i eliminuje powtórzenia.
 */
public class Logger {

    public static void log(String message) {
        System.out.println(message);
    }

}
