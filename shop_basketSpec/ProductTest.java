import shop_basket.*;
import org.junit.*;
import static org.junit.Assert.*;

public class ProductTest{

  Product product1;
  Product product2;

  @Before
  public void before(){
    product1 = new Product(10.00);
    product2 = new Product(8.00);
  }

  @Test
  public void canGetPrice(){
    double price = product1.getPrice();
    assertEquals(10.00, price, 0.1);
  }
}