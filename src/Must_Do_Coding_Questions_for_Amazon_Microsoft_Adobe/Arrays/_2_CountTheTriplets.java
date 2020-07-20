package Must_Do_Coding_Questions_for_Amazon_Microsoft_Adobe.Arrays;

/**
 * @author Vamsi Krishna Govada on 7/17/2020.
 * @project Geeks For Geeks
 */

import java.util.*;
public class _2_CountTheTriplets {
    public static void solve (int []arr){
        int count = 0, len = arr.length;
        Arrays.sort(arr);
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        for(int i=0;i<len;i++)
            hashMap.put(arr[i],0);
        for(int i=0;i<len-1;i++){
            for(int j=i+1;j<len;j++){
                int val = arr[j]+arr[i];
                if(hashMap.containsKey(val))
                    count++;
            }
        }
        if(count==0)
            System.out.println("-1");
        else
            System.out.println(count);
    }
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for(int i=0;i<t;i++){
            int n = scanner.nextInt();
            int []arr = new int[n];
            for(int j=0;j<n;j++){
                arr[j]=scanner.nextInt();
            }
            solve(arr);
        }
    }
}
