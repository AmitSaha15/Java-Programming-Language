import java.util.*;
public class array {

    public static void update(int marks[]){
        for(int i = 0; i < marks.length; i++){
            marks[i] = marks[i] + 1;
        }
    }
    public static void main(String[] args) {
        // int marks[] = new int[100];

        // // Array input
        // Scanner sc = new Scanner(System.in);
        // marks[0] = sc.nextInt();
        // marks[1] = sc.nextInt();
        // marks[2] = sc.nextInt();

        // // Array output
        // System.out.println("Physics = " + marks[0]);
        // System.out.println("Math = " + marks[1]);
        // System.out.println("Chemistry = " + marks[2]);

        int marks[] = {99, 98, 89};
        for(int i = 0; i < marks.length; i++){
            System.out.print(marks[i] + " ");
        }
        System.out.println();
        
        update(marks);

        for(int i = 0; i < marks.length; i++){
            System.out.print(marks[i] + " ");
        }
        System.out.println();
    }
}
