import shop_basket.*;
import org.junit.*;
import static org.junit.Assert.*;

public class CashDeskTest{

  CashDesk cashdesk;
  LoyaltyCard card;
  Customer customer;
  Basket basket;
  Product product1;
  Product product2;
  Product product3;

  @Before
  public void before(){
    cashdesk = new CashDesk();
    card = new LoyaltyCard();
    customer = new Customer();
    basket = new Basket();
    product1 = new Product(20.00, "xxx", true);
    product2 = new Product(10.00, "bbb", true);
    product3 = new Product(30.00, "zzz", false);
  }

  public void fillBasket(){
  basket.add(product1);//20
  basket.add(product1);//FREE
  basket.add(product1);//20
  basket.add(product2);//10
  basket.add(product2);//FREE
  basket.add(product3);//30
  basket.add(product3);//30
  }

//NO BOGOF YET
  @Test
  public void canGive10perCentOffIfTotalIsMoreThan20Pounds(){
    fillBasket();
    assertEquals(126.00, cashdesk.discount(basket), 0.1);
  }

  @Test
  public void canGive2PerCentDiscountUponLoyaltyCard(){
    fillBasket();
    cashdesk.discount(basket);
    assertEquals(123.48, cashdesk.loyaltyCardDiscount(basket, customer));
  }
}
