package hexlet.code.games;

import java.security.SecureRandom;
import java.util.Random;

public interface Game {
    int MAX_NUMBER = 100;
    Random RANDOM = new SecureRandom();
    String getRule();
    String getQuestion();
    String getCorrectAnswer(String question);
}
