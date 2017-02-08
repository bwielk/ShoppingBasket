package shop_basket;
import java.util.*;

public class Basket{

  private List<Product> products;
  private HashMap<Product, Integer> counter;

  public Basket(){
    products = new LinkedList<Product>();
    counter = new HashMap<Product, Integer>();
  }

  public void add(Product product){
    products.add(product);
    if(counter.containsKey(product)){ 
      counter.put(product, counter.get(product) +1);
    }else{
      counter.put(product, 1);
    }
  }

  public HashMap<Product, Integer> getCounter(){
    return counter;
  }

  public int valuesCounter(){
    return counter.size();
  }

  public Integer showUnits(Product product){
    return counter.get(product);
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

  public ArrayList<Product> getItemsForCheckOut(){
    ArrayList<Product> items = new ArrayList<Product>();
    for(Product item : products){
      items.add(item);
    }
    return items;
  }

  public ArrayList<Product> getBogof(){
    ArrayList<Product> bogofs = new ArrayList<Product>();
    for(Product product : products){
      if(product.bogof() == true){
        bogofs.add(product);
      }
    }
    return bogofs;
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