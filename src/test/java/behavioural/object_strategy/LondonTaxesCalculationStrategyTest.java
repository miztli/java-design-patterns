package behavioural.object_strategy;

import com.examples.java.behavioural.object.strategy.LondonTaxesCalculationStrategy;
import com.examples.java.behavioural.object.strategy.Product;
import com.examples.java.behavioural.object.strategy.TaxesCalculationStrategy;
import org.junit.Assert;
import org.junit.Test;

import static com.examples.java.behavioural.object.strategy.App.IPHONE_X;
import static com.examples.java.behavioural.object.strategy.App.LONDON_TAXES;
import static com.examples.java.behavioural.object.strategy.App.BREXIT_BONUS;
import static org.mockito.ArgumentMatchers.anyDouble;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.verify;

public class LondonTaxesCalculationStrategyTest
{
    private final TaxesCalculationStrategy taxesCalculationStrategy =
        new LondonTaxesCalculationStrategy(LONDON_TAXES, BREXIT_BONUS);

    @Test(expected = IllegalArgumentException.class)
    public void whenPassingNullProduct_then_expectException()
    {
        taxesCalculationStrategy.calculateTaxes(null);
    }

    @Test()
    public void whenProvidingValidProduct_expect_productValuesFilled()
    {
        final long id = 1;
        final double expectedTotal = 19243.20;
        final double expectedTax = 0.266;

        final Product product = spy(new Product(id, IPHONE_X, 15200));
        taxesCalculationStrategy.calculateTaxes(product);

        verify(product).setTax(anyDouble());
        verify(product).setTotal(anyDouble());

        Assert.assertEquals(id, product.getId());
        Assert.assertTrue(expectedTax == product.getTax());
        Assert.assertTrue(expectedTotal == product.getTotal());
    }
}

