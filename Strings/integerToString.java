import java.util.Scanner;

public class integerToString {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the integer: ");

        int n = sc.nextInt();

        String str = Integer.toString(n);

        System.out.println("String value: " + str);
    }
}