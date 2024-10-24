package fp.fp02;

import java.util.List;

public class FP02Functional {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(12, 9, 13, 4, 6, 10, 5, 2);

        int sum = sumOfList(numbers);
        System.out.println(sum);

        int maxValue = findMax(numbers);
        System.out.println(maxValue);
        int minValue = findMin(numbers);
        System.out.println(minValue);
    }

    private static int findMin(List<Integer> numbers) {
        return numbers.stream().reduce(Integer.MAX_VALUE, (a, b) -> a <= b ? a : b);
    }

    private static int findMax(List<Integer> numbers) {
        return numbers.stream().reduce(Integer.MIN_VALUE, (a, b) -> a >= b ? a : b);
    }

    private static int sumOfList(List<Integer> numbers) {
        return numbers.stream().reduce(0, Integer::sum);
    }

}
