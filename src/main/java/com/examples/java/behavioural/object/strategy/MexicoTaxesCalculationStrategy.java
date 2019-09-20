package com.examples.java.behavioural.object.strategy;

public class MexicoTaxesCalculationStrategy implements TaxesCalculationStrategy {

    private static final double TAX = 1.16;
    @Override
    public void calculateTaxes(final Product product) {
        product.setTax(TAX);
        product.setTotal(product.getPrice() * TAX);
    }
}
