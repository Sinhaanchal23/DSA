//Print the minimum element of the array....

import java.util.Scanner;
public class minELe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int mini = arr[0];
        for(int i=0; i<arr.length; i++) {
            if(arr[i]<mini) {
                mini = arr[i];
            }
        }
        System.out.print(mini);
    }
    
}
