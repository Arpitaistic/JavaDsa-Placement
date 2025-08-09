public class Typecastingg {
    public static void main(String[] args) {
        int num = (int)(23.4f);
        System.out.println(num);

        //Automatic Type Promotion in Java
        int a = 257;
        byte b = (byte)(a);
        System.out.println(b); //257 % 256 = 1;

        int number = 'b';
        System.out.println(number);

        byte k = 42;
        char m = 'd';
        short s = 1024;
        int i = 12000;
        float f = 21.34f;
        double d = 21.843;
        double result = (f*k) +(i/m)-(d-s);
        System.out.println((f*k) +" "+(i/m)+" "+(d-s));
        System.out.println(result);
    }
}
