package Arrays;

public class Marks {
    public static void main(String[] args) {
        // Declare and initialize an array of marks
        int[] marks = new int [5];
        marks[0] = 97;
        marks[1] = 95;
        marks[2] = 56;
        for (int i = 0; i<3; i++){
            System.out.println("Marks of student" + (i+1) + "is:" + marks[i]);
        }
    }
}
