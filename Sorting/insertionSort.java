import java.util.Scanner;
public class insertionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("enter the elemnets of the array:");
        for(int i=0; i<arr.length; i++) {
            arr[i] = sc.nextInt();

        }
        
        for(int i=1; i<arr.length; i++) {
            int j=i;
            
            while(j>0 && arr[j]<arr[j-1]) {
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }
        }
        for(int ele: arr) {
            System.out.print(ele+" ");

        }

    }
    
}
