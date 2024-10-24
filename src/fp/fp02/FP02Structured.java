package fp.fp02;

import java.util.ArrayList;
import java.util.List;

public class FP02Structured {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(12, 9, 13, 4, 6, 10, 5, 2);

        int sum = sumOfList(numbers);
        System.out.println(sum);
    }

    private static int sumOfList(List<Integer> numbers) {
        int sum = 0;
        for (Integer number : numbers) {
            sum += number;
        }
        return sum;
    }

}
