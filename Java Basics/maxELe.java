// Print the maximum element in the array




import java.util.Scanner;
public class maxELe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int maxi = arr[0];
        for(int i=0; i<arr.length; i++) {
            if(arr[i]>maxi) {
                maxi = arr[i];
            }
        }
        System.out.print(maxi);

    }
    
}
