// rotate array by d roations

import java.util.Scanner;

public class rotateArray {
    public static void reverse(int[] arr, int i, int j) {
        while(i <= j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("enter the elemnts of the array:");
        for(int i=0; i<arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("enter the no. of rotaions:");
        int d = sc.nextInt();

        d = d % n;

        reverse(arr, 0, n-1);
        reverse(arr, 0, d-1);
        reverse(arr, d, n-1);

        for(int ele: arr) {
            System.out.print(ele + " ");
        }
    }
}