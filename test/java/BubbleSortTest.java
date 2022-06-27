import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;


public class BubbleSortTest {

    @Test
    public void sortedListFirst() {
        BubbleSort bubbleSort = new BubbleSort();
        List<Integer> input = Arrays.asList(1, 4, 5, 6, 8, 3, 8);
        List<Integer> result = bubbleSort.sortList(input);
        List<Integer> expect = Arrays.asList(1, 3, 4, 5, 6, 8, 8);

        assertEquals(expect, result);
    }

    @Test
    public void sortedListSecond() {
        BubbleSort bubbleSort = new BubbleSort();
        List<Double> input = Arrays.asList(-9.3, 0.2, 4.0, 0.1, 5.0, 9.0);
        List<Double> result = bubbleSort.sortList(input);
        List<Double> expect = Arrays.asList(-9.3, 0.1, 0.2, 4.0,5.0,9.0);

        assertEquals(expect, result);
    }

    @Test
    public void sortedListThird() {
        BubbleSort bubblesort = new BubbleSort();
        List<Integer> input = Arrays.asList( );
        List<Integer> result = bubblesort.sortList(input);
        List<Integer> expect = Arrays.asList( );

        assertEquals(expect, result);
    }

    @Test
    public void sortedListFourth() {
        BubbleSort bubblesort = new BubbleSort();
        List<Double> input = Arrays.asList(null, 5.0001);
        List<Double> result = bubblesort.sortList(input);
        List<Double> expect = Arrays.asList(5.0001);

        assertEquals(expect, result);
    }


    @Test
    public void sortedListException() {
        BubbleSort bubblesort = new BubbleSort();
        Assertions.assertThrows(NullPointerException.class, () -> {
            List<Double> input = Arrays.asList(null);
        });
    }
}

