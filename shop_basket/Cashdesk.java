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

  public double loyaltyCardDiscount(Basket basket, Customer customer){
    double total = basket.getTotal();
    if(customer.hasLoyaltyCard() == true) return total*0.02;
  }
}