package com.examples.java.behavioural.object.strategy;

public class LondonTaxesCalculationStrategy implements TaxesCalculationStrategy {

    private static final double TAX = 1.28;

    private static final double BREXIT_BONUS = 0.95;

    @Override
    public void calculateTaxes(final Product product) {
        final double TOTAL_TAX = TAX * BREXIT_BONUS;
        product.setTax(TOTAL_TAX);
        product.setTotal(product.getPrice() * TOTAL_TAX);
    }
}

