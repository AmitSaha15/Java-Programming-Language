public class functionOverloading {

    // function overloading using number of parameters

    // function to add 2 nums
    public static int sum(int a,int b){
        return a+b;
    }

    // function to add 3 nums
    public static int sum(int a, int b, int c){
        return a+b+c;
    }

    // function overloading using diff data types of parameters

    // function to multiply 2 integers
    public static int multiply(int a, int b){
        return a*b;
    }

    // function to multiply 2 floats
    public static float multiply(float a, float b){
        return a*b;
    }

    public static void main(String[] args) {
        System.out.println("Sum of 2 nums: " + sum(15, 65));
        System.out.println("Sum of 3 nums: " + sum(89, 47, 23));
        System.out.println("Multiplication of 2 integers: " + multiply(8, 9));
        System.out.println("Multiplication of 2 floats: " + multiply(8.9f, 4.5f));
    }
}
