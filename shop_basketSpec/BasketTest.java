import shop_basket.*;
import org.junit.*;
import static org.junit.Assert.*;

public class BasketTest{

  Basket basket;
  Product product1;
  Product product2;
  Product product3;

  @Before
  public void before(){
    basket = new Basket();
    product1 = new Product(23.00, "xy1", true);
    product2 = new Product(12.00, "xx1", false);
    product3 = new Product(10.00, "xx2", false);
  }
/////////////////////////////////HELPER METHODS
  public void addTwoItems(){
    basket.add(product1);
    basket.add(product2);
  }

  public void addThreeItems(){
    basket.add(product1);
    basket.add(product2);
    basket.add(product3);
  }
///////////////////////////////////////////////
  @Test
  public void canAddProducts(){
    addTwoItems();
    assertEquals(2, basket.numOfItems());
  }

  @Test
  public void canRemoveItems(){
    addThreeItems();
    basket.remove(product1);
    assertEquals(2, basket.numOfItems());
  }

  @Test
  public void canEmptyBasket(){
    addTwoItems();
    basket.empty();
    assertEquals(0, basket.numOfItems());
  }

  @Test
  public void canGetTotalPrice(){
    addThreeItems();
    assertEquals(45.00, basket.getTotal(), 0.1);
  }

  @Test
  public void canGetProductByName(){
    addThreeItems();
    assertEquals(12.00, basket.findProductByName("xx1").get(0).getPrice(), 0.1);
  }

  @Test
  public void canGetProductsByName(){
    addThreeItems();
    basket.add(product1);
    assertEquals(2, basket.findProductByName("xy1").size());
  }

  @Test 
  public void canGetItemsForCheckOut(){
    addThreeItems();
    addTwoItems();
    assertEquals(5, basket.getItemsForCheckOut().size());
  }

  @Test 
  public void canGetBogofs(){
    addThreeItems();
    addTwoItems();
    assertEquals(2, basket.getBogof().size());
  }

}