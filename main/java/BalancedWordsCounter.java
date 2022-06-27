import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class BalancedWordsCounter {

    public int howMuchBalancedSubwords(String input) {
        if (input==null) {
            throw new RuntimeException("input is null");
        }

        if (input.matches(".*\\d.*")) {
            throw new RuntimeException("word contains a digt");
        }
        if (input.isBlank()) {
            return 0;
        }

        int total = 0;
        for (int i = 0; i < input.length(); i++) {
            for (int j = i; j < input.length(); j++) {
                if (isBalanced(input.substring(i, j + 1))) {
                    total++;
                }
            }
        }

        return total;

    }

//aabbc -->[a,b]

    private boolean isBalanced(String subword) {
        Set<Character> distinctChars = new HashSet<>(List.of(subword.chars().mapToObj(c -> (char) c).toArray(Character[]::new)));
        Set<Long> repetitions = distinctChars.stream()
                .map(c -> subword.chars().filter(ch -> ch == c).count())
                .collect(Collectors.toSet());

        return repetitions.size() == 1;
    }
}

