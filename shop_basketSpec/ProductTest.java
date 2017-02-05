import shop_basket.*;
import org.junit.*;
import static org.junit.Assert.*;

public class ProductTest{

  Product product1;
  Product product2;

  @Before
  public void before(){
    product1 = new Product(10.00, "bbb");
    product2 = new Product(8.00, "ccc");
  }

  @Test
  public void canGetPrice(){
    double price = product1.getPrice();
    assertEquals(10.00, price, 0.1);
  }

  @Test
  public void canGetName(){
    String name1 = product1.getName();
    String name2 = product2.getName();
    assertEquals("bbb", name1);
    assertEquals("ccc", name2);
  }
}