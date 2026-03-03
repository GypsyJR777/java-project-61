package hexlet.code.games;

import java.security.SecureRandom;
import java.util.Random;

public interface Game {
    Random random = new SecureRandom();
    String getRule();
    String getQuestion();
    String getCorrectAnswer(String question);
}
