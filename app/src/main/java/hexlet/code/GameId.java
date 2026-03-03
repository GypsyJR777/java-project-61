package hexlet.code;

public enum GameId {
    GREET(1, "Greet"),
    EVEN(2, "Even"),
    CALC(3, "Calc"),
    GCD(4, "GCD"),
    PROGRESSION(5, "Progression"),
    PRIME(6, "Prime"),
    EXIT(0, "Exit");

    private final int code;
    private final String title;

    GameId(int code, String title) {
        this.code = code;
        this.title = title;
    }

    public int getCode() {
        return code;
    }

    public String getTitle() {
        return title;
    }

    public static GameId fromCode(int code) {
        for (GameId gameId : values()) {
            if (gameId.code == code) {
                return gameId;
            }
        }
        return null;
    }
}
