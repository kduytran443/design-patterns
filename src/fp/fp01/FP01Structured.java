package fp.fp01;

import java.util.List;

public class FP01Structured {

    public static void main(String[] args) {
        printAllNumbersInListStructured(List.of(12, 9, 13, 4, 5, 2));
    }

    private static void printAllNumbersInListStructured(List<Integer> integers) {
        for (Integer i : integers) {
            System.out.println(i);
        }
    }

}
