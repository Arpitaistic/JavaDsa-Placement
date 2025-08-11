package Methods;

public class functionOverloading {
    public static void main(String[] args) {
           //Two or more functions of the same name can exist if the parameters are different
           //Same type of arguments but different arguments also work!
           //At compile time, it is decided which function to run.
           fun(67);
           fun("Klaus");
    }
  static void fun(int a){
    System.out.println("First one");
     System.out.println(a);
  }
  static void fun(String name){
    System.out.println("Second one");
    System.out.println(name);
  }
}
