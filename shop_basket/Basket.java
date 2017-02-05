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

  public double getTotal(){
    double total = 0;
    for(Product product : products){
      total += product.getPrice();
    }
    return total;
  }

  public ArrayList<Product> findProductByName(String name){
    ArrayList<Product> list = new ArrayList<Product>();
    for(Product product : products){
      if (product.getName() == name){
        list.add(product);
      }
    }
    return list;
  }
}