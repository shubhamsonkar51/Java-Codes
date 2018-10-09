import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
 class Solution {

    static int[] climbingLeaderboard(int[] scores, int[] alice) {
        // Complete this function
        List<Integer> al = new ArrayList<Integer>();
        int ini=scores[0];
        al.add(scores[0]+10);
        al.add(scores[0]);
        //al.add(scores[0]);
        for(int i=0;i<scores.length;i++){
            if(scores[i]!=ini){
                al.add(scores[i]);
                ini=scores[i];
            }
        }
        al.add(scores[scores.length-1]-10);
        Integer[] arr = new Integer[al.size()];
        arr = al.toArray(arr);
        //  System.out.print(arr.length);
        
        
        int ans[]=new int[alice.length];
        int c=(arr.length)-1;
        for(int i=0;i<alice.length&&c>=0;i++){
            int j=c;
            for(j=c;j>0;j--){
                if(alice[i]>=arr[j]&&alice[i]<arr[j-1]){
                    ans[i]=j;
                    break;
                }
            }
            if(ans[i]==0)
                ans[i]=1;
            c=j;
        }
        
        
        return ans;
    }

    public static void main(String[] args)throws Exception {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] scores = new int[n];
        for(int scores_i = 0; scores_i < n; scores_i++){
            scores[scores_i] = in.nextInt();
        }
        int m = in.nextInt();
        int[] alice = new int[m];
        for(int alice_i = 0; alice_i < m; alice_i++){
            alice[alice_i] = in.nextInt();
        }
        int[] result = climbingLeaderboard(scores, alice);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? "\n" : ""));
        }
        System.out.println("");


        in.close();
    }
}
