import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BalancedWordsCounterTest {

    @Test
    public void balancedFirst() {
        BalancedWordsCounter balancedWord = new BalancedWordsCounter();
        String input = "aabbabcccba";
        int result = balancedWord.howMuchBalancedSubwords(input);
        int expected = 28;
        Assertions.assertEquals(result, expected);
    }

    @Test
    public void balancedSecond() {
        BalancedWordsCounter balancedWord = new BalancedWordsCounter();
        String input = "";
        int result = balancedWord.howMuchBalancedSubwords(input);
        int expected = 0;
        Assertions.assertEquals(result, expected);
    }

    @Test
    public void balancedExceptionNumber() {
        BalancedWordsCounter balancedWord = new BalancedWordsCounter();
        Assertions.assertThrows(RuntimeException.class, () -> {
            String input = null;
            int result = balancedWord.howMuchBalancedSubwords(input);
        });
    }

    @Test
    public void balancedExceptionNumber1() {
        BalancedWordsCounter balancedWord = new BalancedWordsCounter();
        Assertions.assertThrows(RuntimeException.class, () -> {
            String input = "abababa1";
            int result = balancedWord.howMuchBalancedSubwords(input);
        });
    }
}
