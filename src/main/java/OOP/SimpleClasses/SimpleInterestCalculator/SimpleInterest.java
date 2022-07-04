package OOP.SimpleClasses.SimpleInterestCalculator;

import java.math.BigDecimal;

public class SimpleInterest {
    private BigDecimal principal;
    private BigDecimal interest;

    SimpleInterest(String principal, String interest) {
        this.principal = new BigDecimal(principal);
        this.interest = new BigDecimal(interest).divide(new BigDecimal("100"));
    }

    public BigDecimal getPrincipal() {
        return principal;
    }
    public BigDecimal getInterest() {
        return interest;
    }

    public void setPrincipal(BigDecimal principal) {
        this.principal = principal;
    }
    public void setInterest(BigDecimal interest) {
        this.interest = interest;
    }

    BigDecimal calculateTotalValue(int years) {
        return principal.add(principal.multiply(interest).multiply(new BigDecimal(years)));
    }
}