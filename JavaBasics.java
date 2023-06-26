import java.util.*;
public class JavaBasics {
    public static void main(String[] args) {
        // code to calculate sum
        int a = 10;
        int b = 5;
        int sum = a+b;
        // System.out.println(sum);
        
        // Input in Java

        Scanner sc = new Scanner(System.in);
        // String input = sc.next(); // next() --> stores single word input
        // System.out.println(input);

        // String fullName = sc.nextLine(); //nextLine() --> stores value with spaces
        // System.out.println(fullName);

        int number = sc.nextInt(); // stores integer input
        System.out.println(number);
    }
}