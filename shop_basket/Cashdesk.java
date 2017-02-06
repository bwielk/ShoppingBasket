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
    ArrayList<Product> items = new ArrayList<Product>();
    items = basket.getBogof();
    for(int i = 0; i < items.size()/2; i += 1){
      discount += items.get(i).getPrice();
    }
    double total = basket.getTotal();
    return total - discount;
  }

}