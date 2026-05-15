// Missing in Array.........

import java.util.Scanner;
public class missingArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Eneter the size of the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements of the array:");
        for(int i=0; i<arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int sum = (n+1)*(n+2)/2;
        int arraySum = 0;
        for(int ele: arr) {
            arraySum+=ele;
        }
        System.out.print(sum - arraySum);

    }
    
}
