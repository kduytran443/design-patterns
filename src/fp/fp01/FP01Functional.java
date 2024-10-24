package fp.fp01;

import java.util.List;

public class FP01Functional {

    public static void main(String[] args) {
        printEvenNumbersInListFunctional(List.of(12, 9, 13, 4, 6, 10, 5, 2));
    }

    private static void print(int num) {
        System.out.println(String.format("Number: %s", num));
    }

    private static boolean isEven(int num) {
        return num % 2 == 0;
    }

    private static void printAllNumbersInListFunctional(List<Integer> integers) {
        integers.forEach(FP01Functional::print);
    }

    private static void printEvenNumbersInListFunctional(List<Integer> integers) {
        integers.stream()
                .filter(FP01Functional::isEven)
                .forEach(FP01Functional::print);
    }

}
