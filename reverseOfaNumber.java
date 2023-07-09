import java.util.*;
public class reverseOfaNumber {
    public static void main(String[] args) {
        int n = 18594;

        while(n>0){
            int lastdigit = n%10;
            System.out.print(lastdigit);
            n = n/10;
        }
    }
}
