public class insertionSort {

    public static void insertion_sort(int arr[]){
        for(int i = 1; i<arr.length; i++){
            int curr = arr[i];
            int prev = i-1;

            // finding out correct position for insertion
            while(prev>=0 && arr[prev] > curr){ //condition for increasing order
                // for decreasing order --> condition: arr[prev] < curr
                arr[prev + 1] = arr[prev];
                prev--;
            }

            // insertion
            arr[prev+1] = curr;
        }
    }

    public static void print_arr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {5,4,1,3,2};
        insertion_sort(arr);
        print_arr(arr);
    }
}
