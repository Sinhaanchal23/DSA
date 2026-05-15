import java.util.Scanner;

public class oddEvenidx {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Input
        System.out.println("Enter the elements:");
        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // Modify
        for(int i = 0; i < arr.length; i++) {
            if(i % 2 == 1) {
                arr[i] = arr[i] * 2;   // odd index
            } else {
                arr[i] = arr[i] + 10;  // even index
            }
        }

        // Output
        System.out.print("Modified array: ");
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}