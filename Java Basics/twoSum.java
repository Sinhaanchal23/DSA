// Two sum problem............


import java.util.Scanner;

public class twoSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array:");
        int n = sc.nextInt();
        System.out.print("Enter the target number:");
        int tar = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        boolean found = false;

        for(int i=0; i<arr.length; i++) {
            for(int j=i+1; j<arr.length; j++) {
                if(arr[i] + arr[j]==tar) {
                    System.out.print("Target found");
                    found = true;
                    break;
                }
            }
            if(found) break;
        }

        if(!found) {
            System.out.print("Target not found...");
        }
    }
}