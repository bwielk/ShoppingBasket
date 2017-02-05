import shop_basket.*;
import org.junit.*;
import static org.junit.Assert.*;

public class CashdeskTest{

Cashdesk cashdesk;
Basket basket;
Product product1;
Product product2;

@Before
public void before(){
  cashdesk = new Cashdesk();
  basket = new Basket();
  product1 = new Product(20.00, "xxx");
  product2 = new Product(10.00, "bbb");
}

@Test 
public void canAcceptLoyaltyCard(){

}
}
