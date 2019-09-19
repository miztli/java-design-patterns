package com.examples.java.behavioural.object.strategy;

import java.util.List;

public class ProductsStore {

  private TaxesCalculationStrategy taxesCalculationStrategy;

  private List<Product> products;

  public Product buyProductByName(final String name) {
    Product foundProduct = products
                    .stream()
                    .filter(product -> product.getName().equals(name))
                    .findFirst().orElseThrow(() ->
                    new IllegalArgumentException(String.format("Coudn't find product with name: %s", name)));

    getTaxesCalculationStrategy().calculateTaxes(foundProduct);

    return foundProduct;
  }

  public TaxesCalculationStrategy getTaxesCalculationStrategy() {
    return taxesCalculationStrategy;
  }

  public void setTaxesCalculationStrategy(TaxesCalculationStrategy taxesCalculationStrategy) {
    this.taxesCalculationStrategy = taxesCalculationStrategy;
  }

  public List<Product> getProducts() {
    return products;
  }

  public void setProducts(List<Product> products) {
    this.products = products;
  }
}
