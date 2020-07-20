package Must_Do_Coding_Questions_for_Amazon_Microsoft_Adobe.Arrays;

import java.util.Scanner;

/**
 * @author Vamsi Krishna Govada on 7/20/2020.
 * @project Geeks For Geeks
 */
public class _4_Missing_number_in_array {
    public static void solve(int[] arr) {
        int len = arr.length + 1;
        int n = (len * (len + 1)) / 2;
        int sum = 0;
        for (int i = 0; i < len - 1; i++) {
            sum += arr[i];
        }
        System.out.println(n - sum);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            int[] arr = new int[n - 1];
            for (int j = 0; j < n - 1; j++)
                arr[j] = scanner.nextInt();
            solve(arr);
        }
    }
}
