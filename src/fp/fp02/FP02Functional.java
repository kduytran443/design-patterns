package fp.fp02;

import java.util.List;

public class FP02Functional {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(12, 9, 13, 4, 6, 10, 5, 2);

        int sum = sumOfList(numbers);
        System.out.println(sum);
    }

    private static int sumOfList(List<Integer> numbers) {
        return numbers.stream().reduce(0, Integer::sum);
    }

}
