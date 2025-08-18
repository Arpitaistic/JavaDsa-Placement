package Arrays;
import java.util.*;
public class UserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the numbers: ");
        int size = sc.nextInt();
        int [] numbers = new int [size];

        //Input
        for (int i = 0; i<size; i++)
{
            numbers[i] = sc.nextInt();
        }

        //Output
        System.out.println("You entered:");
}        for (int i = 0; i<size; i++){
            System.out.println("Enter number" + (i+1) + ":");
        }
    }
}
