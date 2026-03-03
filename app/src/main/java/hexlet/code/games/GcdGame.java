package hexlet.code.games;

public class GcdGame implements Game {
    @Override
    public String getRule() {
        return "Find the greatest common divisor of given numbers.";
    }

    @Override
    public String getQuestion() {
        int first = RANDOM.nextInt(MAX_NUMBER);
        int second = RANDOM.nextInt(MAX_NUMBER);
        return first + " " + second;
    }

    @Override
    public String getCorrectAnswer(String question) {
        String[] parts = question.split(" ");
        int first = Integer.parseInt(parts[0]);
        int second = Integer.parseInt(parts[1]);
        return String.valueOf(findGcd(first, second));
    }

    private int findGcd(int num1, int num2) {
        if (num2 == 0) {
            return num1;
        }
        return findGcd(num2, num1 % num2);
    }
}
