import shop_basket.*;
import org.junit.*;
import static org.junit.Assert.*;

public class CashDeskTest{

  CashDesk cashdesk;
  Customer customer;
  Basket basket;
  Product product1;
  Product product2;
  Product product3;

  @Before
  public void before(){
    cashdesk = new CashDesk();
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

//NO BOGOF
  @Test
  public void canGive10perCentOffIfTotalIsMoreThan20Pounds(){
    fillBasket();
    assertEquals(126.00, cashdesk.discount(basket), 0.1);
  }

  @Test
  public void canGive2PerCentDiscountUponLoyaltyCard(){
    fillBasket();
    customer.setLoyaltyCardStatus(true);
    assertEquals(137.20, cashdesk.loyaltyCardDiscount(basket.getTotal(), customer), 0.01);
  }

  @Test 
  public void discountsCanCumulate(){
    fillBasket();
    customer.setLoyaltyCardStatus(true);
    double total1 = cashdesk.discount(basket);
    assertEquals(123.48, cashdesk.loyaltyCardDiscount(total1, customer), 0.01);
  }

}
