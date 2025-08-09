import java.util.*;
public class LargestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        //Find the maximum among the three numbers
        int max = a;
        if (b>max){
            max =b;
        } 
        if (c>max) {
           max = c;
        }
        System.out.println(max);
    }
}
