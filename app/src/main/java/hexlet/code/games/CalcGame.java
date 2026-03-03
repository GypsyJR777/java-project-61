package hexlet.code.games;

public class CalcGame implements Game {
    private static final char[] OPERATIONS = {'+', '-', '*'};

    @Override
    public String getRule() {
        return "What is the result of the expression?";
    }

    @Override
    public String getQuestion() {
        int left = RANDOM.nextInt(MAX_NUMBER);
        int right = RANDOM.nextInt(MAX_NUMBER);
        char operation = OPERATIONS[RANDOM.nextInt(OPERATIONS.length)];
        return left + " " + operation + " " + right;
    }

    @Override
    public String getCorrectAnswer(String question) {
        String[] parts = question.split(" ");
        int left = Integer.parseInt(parts[0]);
        int right = Integer.parseInt(parts[2]);
        char operation = parts[1].charAt(0);

        int result = switch (operation) {
            case '+' -> left + right;
            case '-' -> left - right;
            case '*' -> left * right;
            default -> throw new IllegalArgumentException("Unknown operation: " + operation);
        };
        return String.valueOf(result);
    }
}
