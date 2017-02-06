package shop_basket;
import java.util.*;

public class Product{

  private double price;
  private String name;
  private boolean bogof;

  public Product(double price, String name, boolean bogof){
    this.price = price;
    this.name = name;
    this.bogof = bogof;
  }

  public double getPrice(){
    return this.price;
  }

  public String getName(){
    return this.name;
  }

  public boolean bogof(){
    return this.bogof;
  }

}