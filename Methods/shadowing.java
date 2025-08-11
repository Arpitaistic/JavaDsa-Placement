package Methods;

public class shadowing {
    static int x = 90; // This will be shadowed at line 8
    public static void main(String[] args) {
        System.out.println(x); //90 
        int x = 40; // The class variable at line 4 is shadowed by this
        fun();
        System.out.println(x); //40 
        
    }
    static void fun(){
        System.out.println(x);
    }
}
