package Methods;
import java.util.*;
public class changevalue {
    public static void main(String[] args) {
        //create an array
        int [] arr = {1, 3, 4, 45, 56};
        change(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void change(int []nums){
        nums[0] = 99; //if you make a change to the object via reference variable, same object will be changed.
    }    
}
