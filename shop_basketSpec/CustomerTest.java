import shop_basket.*;
import org.junit.*;
import static org.junit.Assert.*;

public class CustomerTest{

  Customer customer;

  @Before
  public void before(){
    customer = new Customer();
  }

  @Test
  public void canUpdateHasCardStatus(){
    customer.setLoyaltyCardStatus(true);
    assertEquals(true, customer.hasLoyaltyCard());
  }

}