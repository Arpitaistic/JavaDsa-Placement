package Methods;

import java.util.*;
public class sum {
   public static void main(String[] args) {
    sum();   
   }

   static void sum (){
       Scanner sc = new Scanner (System.in);
       System.out.print("Please enter number 1: ");
       int number1 = sc.nextInt();
       System.out.print("Please enter number 2: ");
       int number2 = sc.nextInt();
       int sum = number1 + number2;
       System.out.println("Sum is "+ sum);
   }
}
