import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("================================");
        for (int i = 0; i < 3; i++) {
            String str = scanner.next();
            int num = scanner.nextInt();
            // Print left-justified string and zero-padded integer
            System.out.printf("%-15s%03d%n", str, num);
        }
        System.out.println("================================");
        
        scanner.close();
    }
}
