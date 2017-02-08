package shop_basket;
import java.util.*;

public class CashDesk{

  private double income;

  public CashDesk(){
    this.income = 0;
  }

  public double getIncome(){
    return this.income;
  }

  public double discount(Basket basket){
    double total = basket.getTotal();
    return total - 0.1*total;
  }

  public double loyaltyCardDiscount(double total, Customer customer){
    if(customer.hasLoyaltyCard() == true){
      total -= total*0.02;
    }
    return total;
  }

  public double bogof(Basket basket){
    double discount = 0;
    HashMap<Product, Integer> counter = basket.getCounter();
    for(Product product : counter.keySet()){
      if(product.bogof()){
        Integer numberOfItems = counter.get(product)/2;
        discount += product.getPrice()*numberOfItems;
      }
      else{
        break;
      }
    }
    return basket.getTotal() - discount;
  }

}