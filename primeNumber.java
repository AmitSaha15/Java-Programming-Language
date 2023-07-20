// Check if a number is prime or not

public class primeNumber {
    
    // public static boolean isPrime(int n){
    //     // corner case when n=2
    //     if(n == 2){
    //         return true;
    //     }
    //     for(int i = 2; i <= n-1; i++){
    //         if(n % i == 0){
    //             return false;
    //         }
    //     }

    //     return true;
    // }

    public static boolean isPrime(int n){
        if (n == 2){
            return true;
        }

        for(int i=2; i <= Math.sqrt(n); i++){ //sqrt of n for optimization of the loop
            if (n % i == 0){
                return false;
            }
        }

        return true;
    }
    public static void main(String[] args) {
        System.out.println(isPrime(5));
        System.out.println(isPrime(8));
    }
}

