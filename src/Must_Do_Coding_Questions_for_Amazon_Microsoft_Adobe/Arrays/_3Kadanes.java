package Must_Do_Coding_Questions_for_Amazon_Microsoft_Adobe.Arrays;

/**
 * @author Vamsi Krishna Govada on 7/17/2020.
 * @project Geeks For Geeks
 */

import java.util.*;

public class _3Kadanes {
    public static void solve(int [] arr){
        int len = arr.length;
        int max =0,output=Integer.MIN_VALUE,count=0;

            for(int i=0;i<len ;i++){
                if((arr[i]+max)<arr[i])
                    max = arr[i];
                else
                    max+=arr[i];
                if(max>output)
                    output = max;
            }
        System.out.println(output);
    }

    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        for(int i=0;i<t;i++) {
            int n = scanner.nextInt();
            int[] arr = new int[n];
            for (int j = 0; j < n; j++)
                arr[j] = scanner.nextInt();
            solve(arr);
        }
    }
}
