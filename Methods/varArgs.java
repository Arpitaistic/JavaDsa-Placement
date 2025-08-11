package Methods;

import java.util.Arrays;

public class varArgs {
    public static void main(String[] args) {
        fun(2, 3, 4, 6, 7);
        multiple(2, 3, "Arpita","Klaus" );
    }
    
    //Multiple arguments
    private static void multiple(int i, int j, String string, String string2) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'multiple'");
    }
    static void multiple(int a, int b, int...v){

    }
    static void fun(int ...v){
    System.out.println(Arrays.toString(v));
}
}
