package mvc1.model;

/**
 * Model.
 * Te klasy są oczywiście tak proste, że można by zapytać, dlaczego nie zastąpić ich zwykłym Integerem.
 * W standardowych aplikacjach komunikacja pomiędzy widokiem a kontrolerem będzie zawierać dużo więcej danych aniżeli jeden Integer.
 * Ponadto tutaj można umieścić logikę parsowania, walidacji itp.
 */
public class NumberInputDTO {
    Integer value;

    public Integer getValue() {
        return value;
    }

    public NumberInputDTO(String value) {
        this(Integer.parseInt(value));
    }

    private NumberInputDTO(Integer value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value.toString();
    }

}
