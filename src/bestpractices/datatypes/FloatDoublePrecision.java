package bestpractices.datatypes;

import java.math.BigDecimal;

public class FloatDoublePrecision {

    public static void main(String[] args) {
        badPractice();
        goodPractice();
        bestPractice();
    }

    private static void badPractice() {
        double budgetUsd = 1;
        double itemPriceUsd = 0.1;

        System.out.println("Initial budget: " + budgetUsd);
        System.out.println("Initial item price: " + itemPriceUsd);
        System.out.println("Money left after buying 9 items: " + (budgetUsd - itemPriceUsd * 9));
    }

    private static void goodPractice() {
        double budgetUsdCent = 100;
        double itemPriceUsdCent = 10;

        System.out.println("Initial budget: " + budgetUsdCent);
        System.out.println("Initial item price: " + itemPriceUsdCent);
        System.out.println("Money left after buying 9 items: " + (budgetUsdCent - itemPriceUsdCent * 9));
    }

    private static void bestPractice() {
        BigDecimal budgetUsd = BigDecimal.valueOf(1);
        BigDecimal itemPriceUsd = BigDecimal.valueOf(0.1);

        BigDecimal remainBudgetAfterBuying = budgetUsd.subtract(itemPriceUsd.multiply(BigDecimal.valueOf(9)));

        System.out.println("Initial budget: " + budgetUsd);
        System.out.println("Initial item price: " + itemPriceUsd);
        System.out.println("Money left after buying 9 items: " + remainBudgetAfterBuying);
    }

}
