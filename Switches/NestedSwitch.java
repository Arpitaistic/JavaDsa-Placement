import java.util.*;
public class NestedSwitch {
   public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    int empID = sc.nextInt();
    String department = sc.next();
    switch (empID){
    case 1:
    System.out.println("Klaus Mikealson");
    break;
    case 2: 
    System.out.println("Stefan Salvatore");
    break;
    case 3:
    System.out.println("Employee number 3");
    switch (department){
        case "Originals": 
        System.out.println("He belongs to the Originals");
        break;
        case "Vampire Diaries":
        System.out.println("He belongs to the vampire diaries");
        break;
        default:
        System.out.println("No department entered");

    }
    default:
    System.out.println("Enter correct employee Id!");
    }
   } 
}
