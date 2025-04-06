import java.util.*;

public class CoprimePairs {
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Function to count coprime pairs
    public static int countCoprimePairs(int n, int[] arr) {
        // Remove duplicates by using a HashSet
        Set<Integer> uniqueNumbers = new HashSet<>();
        for (int num : arr) {
            uniqueNumbers.add(num);
        }

        // Convert the set back to an array for easier iteration
        Integer[] uniqueArray = uniqueNumbers.toArray(new Integer[0]);
        int count = 0;

        // Check all pairs (i, j) where i < j
        for (int i = 0; i < uniqueArray.length; i++) {
            for (int j = i + 1; j < uniqueArray.length; j++) {
                // If gcd is 1, the pair is coprime
                if (gcd(uniqueArray[i], uniqueArray[j]) == 1) {
                    count++;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input number of elements
        int n = scanner.nextInt();

        // Input array elements
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Output the number of coprime pairs
        System.out.println(countCoprimePairs(n, arr));

        scanner.close();
    }
}
