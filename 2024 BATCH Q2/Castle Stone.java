import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int cap = scanner.nextInt();
        int n = scanner.nextInt();
        int[] stones = new int[n];

        for (int i = 0; i < n; i++) {
            stones[i] = scanner.nextInt();
        }

        Arrays.sort(stones);

        int turns = 0;
        int left = 0;
        int right = n - 1;

        while (left <= right) {
            if (stones[right] + stones[left] <= cap) {
                left++;
            }
            right--;
            turns++;
        }

        System.out.println(turns);

        scanner.close();
    }
}