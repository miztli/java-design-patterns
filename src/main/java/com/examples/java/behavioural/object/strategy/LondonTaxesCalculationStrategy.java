package com.examples.java.behavioural.object.strategy;

import com.examples.java.utils.Preconditions;

/**
 * Concrete implementation for London's taxes calculation.
 */
public class LondonTaxesCalculationStrategy implements TaxesCalculationStrategy {

    private double tax;

    private double brexitBonus;

    public LondonTaxesCalculationStrategy()
    {
    }

    public LondonTaxesCalculationStrategy(final double tax, final double brexitBonus)
    {
        this.tax = tax;
        this.brexitBonus = brexitBonus;
    }

    @Override
    public void calculateTaxes(final Product product) {
        Preconditions.isNotNull(product, "product");
        final double totalTax = getTax() * getBrexitBonus();
        final double multiplyBy = 1 + totalTax;
        product.setTax(totalTax);
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

    public double getBrexitBonus()
    {
        return brexitBonus;
    }

    public void setBrexitBonus(final double brexitBonus)
    {
        this.brexitBonus = brexitBonus;
    }
}

