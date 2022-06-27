import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        BubbleSort test1 = new BubbleSort();
        List<Integer> result1 = test1.sortList(Arrays.asList(1, 4, 5, 6, 8, 3, 8));
        System.out.println(result1);

        BalancedWordsCounter test2 = new BalancedWordsCounter();
        Integer result2 = test2.howMuchBalancedSubwords("aabbabcccba");
        System.out.println(result2);

    }
}
