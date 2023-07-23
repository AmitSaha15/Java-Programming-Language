public class rotatedHalfPyramid {

    public static void rotated_HalfPyramid(int n){
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= n-i; j++){
                System.out.print(" "); // for spaces
            }
            for (int j =1; j <= i; j++){
                System.out.print("*"); // for stars
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        rotated_HalfPyramid(4);
    }
}
