// Convert decimal number to binary number

import java.util.Scanner;

public class decimalToBinary {

    public static int decToBin(int decNum){
        int binNum = 0;
        int pow = 0;
        while(decNum > 0){
            int rem = decNum % 2;
            binNum = binNum + (rem * (int) Math.pow(10, pow));
            decNum = decNum / 2;
            pow++;
        }

        return binNum;
    }
    public static void main(String[] args) {
        System.out.print("Enter the decimal number: ");
        Scanner sc = new Scanner(System.in);
        int decNum = sc.nextInt();
        System.out.println("Binary of " + decNum + " = " + decToBin(decNum));
    }
}
