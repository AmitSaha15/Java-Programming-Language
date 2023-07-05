// Sum of first n Natural numbers

import java.util.*;
public class sumOfNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt();
        int sum = 0;
        int i = 1;

        while(i <= n) {
            sum += i;
            i++;
        }
        System.out.println("Sum = " + sum);
    }
}
