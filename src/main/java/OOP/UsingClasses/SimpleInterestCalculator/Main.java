package OOP.UsingClasses.SimpleInterestCalculator;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        SimpleInterest calculator = new SimpleInterest("4500.00", "7.5");
        BigDecimal totalValue = calculator.calculateTotalValue(5);
        System.out.println("The Total amount you have to pay for " + calculator.getPrincipal() + " at the rate of " + calculator.getInterest() + " Interest in span 5 years is: " + totalValue);
    }
}