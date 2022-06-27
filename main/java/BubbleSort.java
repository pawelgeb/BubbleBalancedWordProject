import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class BubbleSort {

    public <T extends Comparable<T>> List<T> sortList(List<T> input) {
        if (input == null) {
            throw new NullPointerException("input cannot be null");
        }
        return bubbleSort(input);
    }

    private <T extends Comparable<T>> List<T> bubbleSort(List<T> input) {

        final var output = input.stream()
                .filter(Objects::nonNull)
                .collect(Collectors.toList());

        final var inputSize = output.size();
        for (var i =0; i < inputSize; i++) {
            for (var j=0; j<inputSize-1; j++) {
                if (output.get(j).compareTo(output.get(j+1))>0) {
                    Collections.swap(output, j, j+1);
                }
            }
        }
        return output;
    }
}
