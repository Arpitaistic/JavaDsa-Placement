package Methods;
import java.util.*;
public class returnstring {
    public static void main(String[] args) {
        String greeting = greet();
        System.out.println(greeting);
    }
    static String greet(){
        Scanner sc = new Scanner (System.in);
        System.out.print("Please enter your greeting: ");
        String greeting = sc.next();
        return greeting;
    }
}
