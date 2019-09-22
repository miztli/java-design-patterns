package com.examples.java.behavioural.object.strategy;

/**
 * A common example for the Strategy pattern is
 * a tax calculation algorithm, which will behave differently
 * depending greatly on the country, state, or place
 * we're in.
 */
public interface TaxesCalculationStrategy {
    /**
     * Calculate and set the taxes for the product
     * @param product The provided product.
     */
    void calculateTaxes(Product product);

}
