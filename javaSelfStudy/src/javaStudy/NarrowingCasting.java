package javaStudy;

public class NarrowingCasting {
    
  public static void main(String[] args) {
    
    // 1. We start with a larger data type (double) that holds decimals
    double exactAverage = 89.75;
    
    // 2. We use Narrowing Casting to force the double into an int
    int reportCardGrade = (int) exactAverage;
    
    // 3. Let's print both out to see the difference
    System.out.println("Original Exact Average: " + exactAverage);
    System.out.println("Final Report Card Grade: " + reportCardGrade);


  }

}
