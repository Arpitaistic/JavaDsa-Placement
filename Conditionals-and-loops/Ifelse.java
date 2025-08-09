

public class Ifelse {
    public static void main(String[] args) {
        /*Syntax of If-Else
         * if (boolean expression T or F){
         * //body
         * }  else{
         * 
         * }
         * 
        */
        int salary = 10000;
        if (salary>10000){
           salary = salary + 1000;
        } else{
            salary = salary + 2000;
        }
        System.out.println(salary);
    }
}
