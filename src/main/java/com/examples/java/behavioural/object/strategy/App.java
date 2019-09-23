package com.examples.java.behavioural.object.strategy;

import java.util.List;

public class App {
  public static final String MACBOOK_PRO = "macbook pro";
  public static final String IPHONE_X = "iphoneX";
  public static final String ADAPTOR_X = "adaptorX";
  public static final String ANOTHER_ADAPTOR = "anotherFuckingAdaptor";
  public static final double MEXICO_TAXES = 0.16;
  public static final double LONDON_TAXES = 0.28;
  public static final double BREXIT_BONUS = 0.95;

  public static void main(String[] args) {
    final ProductsStore store = new ProductsStore();
      store.setProducts(initializeDefaultProductList());

    System.out.println("In Mexico, some wealthy guy goes into apple to buy the new iPhone");
    // At runtime we could decide which strategy to use based on some condition, in this example: the country.
    store.setTaxesCalculationStrategy(new MexicoTaxesCalculationStrategy(MEXICO_TAXES));
    Product iPhoneInMexico = store.buyProductByName(IPHONE_X);
    printDetails(iPhoneInMexico);

    System.out.println("In London, some wealthy guy goes into apple to buy the new iPhone");
    store.setTaxesCalculationStrategy(new LondonTaxesCalculationStrategy(LONDON_TAXES, BREXIT_BONUS));
    Product iPhoneInLondon = store.buyProductByName(IPHONE_X);
    printDetails(iPhoneInLondon);
  }

  public static void printDetails(final Product product) {
    System.out.println(
            String.format("Wealthy guy spent a total of $%6.2f in product %s, payed $%2.2f in taxes",
                    product.getTotal(), product.getName(), product.getTax()));
  }

  public static List<Product> initializeDefaultProductList() {
    return List.of(
            new Product(1, MACBOOK_PRO, 24000),
            new Product(2, IPHONE_X, 15200),
            new Product(3, ADAPTOR_X, 1500),
            new Product(4, ANOTHER_ADAPTOR, 2100));
  }
}
