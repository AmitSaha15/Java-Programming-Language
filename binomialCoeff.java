// Find binomial coefficient

public class binomialCoeff {
    public static int Factorial(int n){
        int fact = 1;
        for(int i = 1; i <= n; i++){
            fact *= i;
        }
        return fact;
    }

    public static int binCoeff(int n, int r){
        int nFact = Factorial(n);
        int rFact = Factorial(r);
        int nmrFact = Factorial(n-r);

        int BC = nFact / (rFact * nmrFact);
        return BC;
    }
    public static void main(String[] args) {
        System.out.println(binCoeff(5, 2));
    }
}
