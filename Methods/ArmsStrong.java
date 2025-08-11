package Methods;
import java.util.*;
public class ArmsStrong {
    ///To print all the 3 Digit Armstrong Number
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        for (int i = 100; i<1000; i++){
            if (isArmstrong(i)){
                System.out.println(i);
            }
        }
    }
    static boolean isArmstrong(int n){

        int original = n;
        int sum = 0;

        while(n>0){
            int rem = n%10;
            n = n/10;
            sum = sum + rem*rem*rem;
        }
      return sum == original;
    }
}
