import java.util.Scanner;
public class selectionSort {
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
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();

        }
        print(arr);
        for(int i=0; i<n-1; i++) {
            int minELE= Integer.MAX_VALUE;
            int minIDX = -1;
            for(int j=i; j<n; j++) {
                if(arr[j]<minELE) {
                    minELE = arr[j];
                    minIDX = j;
                }

            }
            int temp = arr[i];
            arr[i] = arr[minIDX];
            arr[minIDX] = temp;
        }
        print(arr);
    }
}
