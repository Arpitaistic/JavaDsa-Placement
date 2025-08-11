package Methods;
import java.util.*;
public class returnsum {
   public static void main(String[] args) {
    int ans = sum2();
    System.out.println(ans);
   } 
   static int sum2(){
    Scanner sc = new Scanner (System.in);
    System.out.println("Please enter number 1: ");
    int number1 = sc.nextInt();
    System.out.println("Please enter number 2: ");
    int number2 = sc.nextInt();
    int sum = number1 + number2;
    return sum;
   }
}
