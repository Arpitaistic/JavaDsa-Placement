import java.util.*;
public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Please enter first number:");
        int num1 = sc.nextInt();
        System.out.print("Please enter second number:");
        int num2 = sc.nextInt();
        int sum = num1 + num2;
        System.out.println("Your sum is" + " "+ sum);

    }
}
