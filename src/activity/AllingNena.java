package Activity;

//Widening Casting with Narrow Casting
// POINT OF SALE

public class AllingNena {
    
  int kilograms;
  double price;
  double totalPrice;
  double payment;
  int value;   

 public AllingNena(int kilograms, double price, double payment, int value){

   this.kilograms = kilograms;
   this.price = price;
   this.payment = payment;
   this.value = value;

 }

  public void pointOfSale() {

        double totalPrice = kilograms * price;
        System.out.println("--- NEIGHBORHOOD STORE POS ---");
        System.out.println("Kilograms of Rice : " + kilograms + "\nPrice per Kilo: " + price);
        System.out.println("Total Amount Due : " + totalPrice);
    
        double subtracting = payment -totalPrice;
        
        System.out.println("Exact Change : " + subtracting);

        int piggyBankCoin = (int) subtracting;
        System.out.println("Dropped in Piggy Bank : " + piggyBankCoin);

        char promoX = (char) value;
        System.out.println("Secret Promo Letter : " + promoX);

    }


    public static void main(String[] args) {

        AllingNena overAll = new AllingNena(5, 45.50,500.00,88);

        overAll.pointOfSale();

        

    }



}

