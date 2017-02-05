package shop_basket;
import java.util.*;

public class Customer{

  private boolean cardStatus;

  public Customer(){
    cardStatus = false;
  }

  public void setLoyaltyCardStatus(boolean status){
    cardStatus = status;
  }

  public boolean hasLoyaltyCard(){
    return cardStatus;
  }
  
}