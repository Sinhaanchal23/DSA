import java.util.Scanner;
public class bubbleSort {
    public static void print(int[] arr) {
        for(int ele: arr) {
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements of the array:");
        for(int i=0; i<arr.length; i++) {
            arr[i] = sc.nextInt();

        }
        print(arr);
        for(int i=0; i<n-1; i++) {
            int swap = 0;      
            for(int j=0; j<n-1-i; j++) {
                if(arr[j]>arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swap++;
                }
            }
            if(swap==0) {
                break;
            }
        }
        print(arr);



    }
    
}
