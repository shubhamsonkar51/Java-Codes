import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class nds{

    static int nonDivisibleSubset(int k, int[] arr) {
        // Complete this function
        int r[]=new int[k];
        for(int i=0;i<k;i++){
            r[i]=0;
        }
        int max=0;
        for(int i=0;i<arr.length;i++){
            int mod=arr[i]%k;
            r[mod]++;
            if(r[mod]>max)
                max=r[mod];
        }
        return max;
    }

    public static void main(String[] args) throws Exception{
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] arr = new int[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        int result = nonDivisibleSubset(k, arr);
        System.out.println(result);
       // in.close();
    }
}