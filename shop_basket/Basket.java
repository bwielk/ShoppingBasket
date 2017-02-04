package shop_basket;
import java.util.*;

public class Basket{

  public List<Product> products;

  public Basket(){
    products = new LinkedList<Product>();
  }

  public void add(Product product){
    products.add(product);
  }

  public int numOfItems(){
    return products.size();
  }

  public void remove(Product product){
    products.remove(product);
  }

  public void empty(){
    products.clear();
  }
}