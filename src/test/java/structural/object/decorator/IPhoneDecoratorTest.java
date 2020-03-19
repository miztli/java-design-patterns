package structural.object.decorator;

import com.examples.java.structural.object.decorator.IPhone;
import com.examples.java.structural.object.decorator.IPhoneDecorator;
import org.junit.Test;

public class IPhoneDecoratorTest {

  private IPhone iPhone = new IPhone();

  private IPhoneDecorator iPhoneWithDecorator = new IPhoneDecorator(iPhone);

  @Test
  public void whenUsingOnlyIPhone_then_displayStandardMessages()
  {
    System.out.println("Testing only iPhone");
    iPhone.on();
    iPhone.lockScreen();
    iPhone.unlockScreen();
    iPhone.restart();
    iPhone.shutdown();
  }

  @Test
  public void whenUsingIPhoneWithDecorator_then_displayDecoratedMessages()
  {
    System.out.println("Testing iPhone with decorators");
    iPhoneWithDecorator.on();
    iPhoneWithDecorator.lockScreen();
    iPhoneWithDecorator.unlockScreen();
    iPhoneWithDecorator.restart();
    iPhoneWithDecorator.shutdown();
  }
}
