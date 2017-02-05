package shop_basket;
import java.util.*;

public class Product{

  double price;
  String name;

  public Product(double price, String name){
    this.price = price;
    this.name = name;
  }

  public double getPrice(){
    return this.price;
  }

  public String getName(){
    return this.name;
  }
}