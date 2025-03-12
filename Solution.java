import java.util.Scanner;

public class Solution {
    public static long lcm(long a, long b) {
        return (a * b) / gcd(a, b);
    }
    public static long gcd(long a, long b) {
        while (b != 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public static long smallMultiple(int n) {
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result = lcm(result, i);
        }
        return result;
    }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt(); 
    int[] T = new int[t];
    for (int i = 0; i < t; i++) {
        T[i] = sc.nextInt();
    }
    for (int n : T) {
        System.out.println(smallMultiple(n));
    }
 }
}
