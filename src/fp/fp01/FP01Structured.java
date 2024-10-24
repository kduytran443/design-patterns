package fp.fp01;

import java.util.List;

public class FP01Structured {

    public static void main(String[] args) {
        printEvenNumbersInListStructured(List.of(12, 9, 13, 4, 6, 10, 5, 2));
    }

    private static void print(int num) {
        System.out.println(String.format("Number: %s", num));
    }

    private static void printAllNumbersInListStructured(List<Integer> integers) {
        for (Integer i : integers) {
            print(i);
        }
    }

    private static void printEvenNumbersInListStructured(List<Integer> integers) {
        for (Integer i : integers) {
            if (i % 2 == 0) {
                print(i);
            }
        }
    }

}
