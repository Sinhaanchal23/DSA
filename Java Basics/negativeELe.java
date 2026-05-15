
// Given an Array, print negative elements only



import java.util.Scanner;
public class negativeELe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array");
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i=0; i<arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for(int i=0; i<arr.length; i++) {
            if(arr[i]<0) {
                System.out.print(arr[i]);
            }
        }
    }
    
}
