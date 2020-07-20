package Must_Do_Coding_Questions_for_Amazon_Microsoft_Adobe.Arrays;

import java.util.Scanner;

/**
 * @author Vamsi Krishna Govada on 7/20/2020.
 * @project Geeks For Geeks
 */
public class _9_Sort_an_array_of_0s_1s_and_2s {

    public static void solve(int[] arr) {

        int len = arr.length;
        int zero_count = 0, one_count = 0;
        for (int i = 0; i < len; i++) {
            if (arr[i] == 1)
                one_count++;
            else if (arr[i] == 0)
                zero_count++;
            else
                continue;
        }
        for (int i = 0; i < zero_count; i++)
            arr[i] = 0;
        for (int i = zero_count; i < zero_count + one_count; i++)
            arr[i] = 1;
        for (int i = zero_count + one_count; i < len; i++)
            arr[i] = 2;

        StringBuffer sb = new StringBuffer("");
        for (int i = 0; i < len; i++)
            sb.append(arr[i] + " ");
        System.out.println(sb);
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            int[] arr = new int[n];
            for (int j = 0; j < n; j++)
                arr[j] = scanner.nextInt();
            solve(arr);
        }
    }
}
