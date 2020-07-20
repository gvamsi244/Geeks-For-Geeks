package Must_Do_Coding_Questions_for_Amazon_Microsoft_Adobe.Arrays;

import java.util.*;

/**
 * @author Vamsi Krishna Govada on 7/17/2020.
 * @project Geeks For Geeks
 */

public class _1_SubarrayWithGivenSum {


    public static void solve2(int[] arr, int s) {

        int len = arr.length;
        int sum = 0, flag = 0;
        L1:
        for (int i = 0; i < len; i++) {
            for (int j = i; j < len; j++) {
                sum += arr[j];
                if (sum == s) {
                    flag = 1;
                    i = i + 1;
                    j = j + 1;
                    System.out.println(i + " " + j);
                    break L1;
                } else if (sum > s) {
                    sum = 0;
                    break;
                } else
                    continue;
            }
        }

        if (flag == 0)
            System.out.println("-1");
    }

    public static void solve1(int[] arr, int s) {

        int len = arr.length;
        int sum = 0, flag = 0;
        L1:
        for (int i = 0; i < len; i++) {
            for (int j = i; j < len; j++) {
                sum += arr[j];
                if (sum == s) {
                    flag = 1;
                    i = i + 1;
                    j = j + 1;
                    System.out.println(i + " " + j);
                    break L1;
                } else if (sum > s) {
                    sum = 0;
                    break;
                } else
                    continue;
            }
        }

        if (flag == 0)
            System.out.println("-1");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            int s = scanner.nextInt();
            int arr[] = new int[n];
            for (int j = 0; j < n; j++)
                arr[j] = scanner.nextInt();
            System.out.println(" Solve1 =");
            solve1(arr, s);
            System.out.println(" Solve2 =");
            solve2(arr, s);
        }
    }
}
