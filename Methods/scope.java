package Methods;
import java.util.*;
public class scope {
    public static void main(String[] args) {
        //We can only access something within the scope, not outside of it!

    }

    static void swap (int num1, int num2){
        int temp = num1;
        num1 = num2;
        num2 = temp;
        //The change will only be valid in this function scope!

    }
    //Block Scope:
    // Values initialized in this block will remain in this block!
    // If something is initialized outside then it can be modified within the block!  
}
    //Loop Scope:
    for (int i = 1; i<4; i++){
        System.out.println(i);
    }
