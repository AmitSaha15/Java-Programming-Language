// Convert binary number to decimal number

import java.util.Scanner;

public class binaryToDecimal {

    public static int binToDec(int binNum){
        int pow = 0;
        int decNum = 0;
        while(binNum>0){
            int lastDigit = binNum % 10;
            decNum = decNum + (lastDigit * (int) Math.pow(2, pow));
            pow++;
            binNum /= 10;
        }

        return decNum;
    }
    public static void main(String[] args) {
        System.out.print("Enter the binary number: ");
        Scanner sc = new Scanner(System.in);
        int binNum = sc.nextInt();
        System.out.println("Decimal of " + binNum + " = " + binToDec(binNum));
    }
}
