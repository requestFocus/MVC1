package mvc1.model;

public class ScoreOutputDTO {
    String message;
    Integer value;

    public String getMessage() {
        return message;
    }

    public Integer getValue() {
        return value;
    }

    public ScoreOutputDTO(String message, Integer value) {
        this.message = message;
        this.value = value;
    }

}
