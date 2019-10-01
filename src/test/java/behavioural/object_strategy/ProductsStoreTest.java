package behavioural.object_strategy;

import com.examples.java.behavioural.object.strategy.Product;
import com.examples.java.behavioural.object.strategy.ProductsStore;
import com.examples.java.behavioural.object.strategy.TaxesCalculationStrategy;
import org.junit.Before;
import org.junit.Test;

import java.util.Collections;

import static com.examples.java.behavioural.object.strategy.App.IPHONE_X;
import static com.examples.java.behavioural.object.strategy.App.initializeDefaultProductList;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.*;

public class ProductsStoreTest
{

  private final ProductsStore productsStore = spy(ProductsStore.class);

  private final TaxesCalculationStrategy taxesCalculationStrategy  = mock(TaxesCalculationStrategy.class);

  @Before
  public void setup() {
    productsStore.setProducts(initializeDefaultProductList());
    productsStore.setTaxesCalculationStrategy(taxesCalculationStrategy);
  }

  @Test(expected = IllegalArgumentException.class)
  public void whenProductNameIsBlank_thenExpectException() {
    productsStore.buyProductByName(null);
  }

  @Test(expected = IllegalArgumentException.class)
  public void whenListOfProductsIsEmpty_thenExpectException() {
    when(productsStore.getProducts())
            .thenReturn(Collections.emptyList());

    productsStore.buyProductByName(IPHONE_X);
  }

  @Test(expected = IllegalArgumentException.class)
  public void whenListOfProductsIsNotSet_thenExpectException() {
    when(productsStore.getProducts())
            .thenReturn(null);

    productsStore.buyProductByName(IPHONE_X);
  }

  @Test
  public void testBuyingAProductByName() {
    final Product product = productsStore.buyProductByName(IPHONE_X);

    verify(taxesCalculationStrategy).calculateTaxes(any(Product.class));

    assertNotNull(product);
    assertEquals(IPHONE_X, product.getName());
  }
}
