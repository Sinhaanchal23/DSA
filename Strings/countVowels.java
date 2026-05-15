import java.util.Scanner;
public class countVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String:");
        String str = sc.next();
        int count = 0;
        for(int i=0; i<str.length(); i++) {
            if(str.charAt(i)=='a' || str.charAt(i)=='i' || str.charAt(i)=='e' || str.charAt(i)=='o' || str.charAt(i)=='u') {
                count++;

            }
        }
        System.out.print(count);

    }
}