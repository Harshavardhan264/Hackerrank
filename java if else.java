import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); 
        scanner.close();

        if (n % 2 != 0) {
            System.out.println("Weird"); // Odd numbers are weird
        } else if (n >= 2 && n <= 5) {
            System.out.println("Not Weird"); // Even and in range 2-5
        } else if (n >= 6 && n <= 20) {
            System.out.println("Weird"); // Even and in range 6-20
        } else {
            System.out.println("Not Weird"); // Even and greater than 20
        }
    }
}
