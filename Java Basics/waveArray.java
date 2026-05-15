// Wave Array.........

import java.util.Scanner;
public class waveArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the size of the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("enter the elements of the array:");
        for(int i=0; i<arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for(int i=0; i<arr.length; i+=2) {
            if(i==arr.length-1) {
                break;
            }
            int temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
        }
        for(int ele: arr) {
            System.out.print(ele + " ");
        }
    }

    
}
