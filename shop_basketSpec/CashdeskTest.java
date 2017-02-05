import shop_basket.*;
import org.junit.*;
import static org.junit.Assert.*;

public class CashDeskTest{

CashDesk cashdesk;
Basket basket;
Product product1;
Product product2;
Product product3;

@Before
public void before(){
  cashdesk = new CashDesk();
  basket = new Basket();
  product1 = new Product(20.00, "xxx", true);
  product2 = new Product(10.00, "bbb", true);
  product3 = new Product(6.00, "zzz", false);
}

public void fillBasket(){
  basket.add(product1);
  basket.add(product1);
  basket.add(product1);
  basket.add(product2);
  basket.add(product2);
  basket.add(product3);
  basket.add(product3);
}

@Test 
public void buyOneGetOneWorks(){
  fillBasket();
}

}
