import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class sol1{

    public static int primeFactors(int n)
    {
        int ans=0,c=0;
        while (n%2==0)
        {
            //System.out.print(2 + " ");
            if(c!=2){
                
                ans++;
            }
            c=2;
            
            n /= 2;
        }
 
        for (int i = 3; i <= Math.sqrt(n); i+= 2)
        {
            while (n%i == 0)
            {
                //System.out.print(i + " ");
                if(c!=i)
                    ans++;
                c=i;
                n /= i;
            }
        }
 
        if (n > 2)
            ans++;
            //System.out.print(n);
        return ans;
    }
 
    public static void main (String[] args) throws Exception
    {
        //int n = 315;
       // String ans=" ";
        Scanner in=new Scanner(System.in);
    
        int n=in.nextInt();
        for(int i=0;i<n;i++){
            int q=in.nextInt();
             System.out.println(primeFactors(q));
        }
       
    }
}