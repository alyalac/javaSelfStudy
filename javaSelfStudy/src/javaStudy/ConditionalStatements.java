// == (Equal to) -> 10 == 10 (True), 10 == 5 (False)
// != (Not equal to) -> 10 != 5 (True), 10 != 10 (False)
// >  (Greater than) -> 15 > 10 (True), 10 > 15 (False)
// <  (Less than) -> 5 < 10 (True), 10 < 5 (False)
// >= (Greater than or equal to) -> 10 >= 10 (True), 11 >= 10 (True), 9 >= 10 (False)
// <= (Less than or equal to) -> 5 <= 5 (True), 4 <= 5 (True), 6 <= 5 (False)

package javaStudy;


public class ConditionalStatements {

    
   



    public static void ifElse(){
     
        int age = 16;
     
   if(age >= 18){
    System.out.print("\nWell Done\n");
   }
   else{
     System.out.print("18+ Only\n");
   }
    }




   public static void booleanIfElse(){

    boolean loyalty = true;

     if(loyalty) {
       System.out.println("\nLoyalty: " + true);
     }

     else{
            System.out.println("Loyalty" + true);
       }
    } 




  public static void main(String[]args){
   

      ifElse();

      booleanIfElse();
    


  }

   }
