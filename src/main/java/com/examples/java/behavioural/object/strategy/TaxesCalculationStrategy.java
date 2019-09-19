package com.examples.java.behavioural.object.strategy;

/**
 * A common example to exemplify the Strategy pattern is
 * a tax calculation algorithm, which will behave differently
 * depending greatly on the cuntry, state, or place
 * we're in.
 */
public interface TaxesCalculationStrategy {

    void calculateTaxes(Product product);

}
