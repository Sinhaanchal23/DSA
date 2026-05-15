// Segregate 0s and 1s......

import java.util.Scanner;
public class zeroesAndOnes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements of the array:");
        for(int i=0; i<arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int i=0;
        int j= arr.length-1;
        while(i<j) {
            
            if(arr[i]==0) {
                i++;
            }
            else if(arr[j]==1) {
                j--;
            }
            else{
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
        for(int ele: arr) {
            System.out.print(ele + " ");
        }
    }
    
}
