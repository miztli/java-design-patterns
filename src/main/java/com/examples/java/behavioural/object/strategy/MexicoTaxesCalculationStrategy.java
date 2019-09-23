package com.examples.java.behavioural.object.strategy;

/**
 * Concrete implementation for Mexico's taxes calculation.
 */
public class MexicoTaxesCalculationStrategy implements TaxesCalculationStrategy {

    private double tax;

    public MexicoTaxesCalculationStrategy(final double tax)
    {
        this.tax = tax;
    }

    @Override
    public void calculateTaxes(final Product product) {
        final double multiplyBy = 1 + getTax();
        product.setTax(getTax());
        product.setTotal(product.getPrice() * multiplyBy);
    }

    public double getTax()
    {
        return tax;
    }

    public void setTax(final double tax)
    {
        this.tax = tax;
    }
}
