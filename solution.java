import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.PriorityQueue;

class Solution {
    
        public static void main(String[] args) throws IOException {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
            Scanner sc =new Scanner(System.in);
            int n=in.nextInt();
            int k=in.nextInt();
            int c[]=in.nextIntArray(n);
            boolean f=false;
            int start=0+k-1,end=start+k-1,q=0;
            for(;start>=0;)
            {
                if(c[start]==1)
                    if(start>=n||end>=n)
                    { f=true; break; }
                    else
                    {start=end+1;end=start+k-1;q++;}
                else
                {start--;end--;}
                
            }
            if(f)
                System.out.print(q);
            else
                System.out.print("-1");   
    }
    
    
    
    
    
    
    
    
    
    

    /*///////////////////////////////////////////////////////////*/
            //INPUT


    static class Scanner
    {
        BufferedReader br;
        StringTokenizer tk=new StringTokenizer("");
        public Scanner(InputStream is) 
        {
            br=new BufferedReader(new InputStreamReader(is));
        }
        public int nextInt() throws IOException
        {
            if(tk.hasMoreTokens())
                return Integer.parseInt(tk.nextToken());
            tk=new StringTokenizer(br.readLine());
            return nextInt();
        }
        public long nextLong() throws IOException
        {
            if(tk.hasMoreTokens())
                return Long.parseLong(tk.nextToken());
            tk=new StringTokenizer(br.readLine());
            return nextLong();
        }
        public String next() throws IOException
        {
            if(tk.hasMoreTokens())
                return (tk.nextToken());
            tk=new StringTokenizer(br.readLine());
            return next();
        }
        public String nextLine() throws IOException
        {
            tk=new StringTokenizer("");
            return br.readLine();
        }
        public double nextDouble() throws IOException
        {
            if(tk.hasMoreTokens())
                return Double.parseDouble(tk.nextToken());
            tk=new StringTokenizer(br.readLine());
            return nextDouble();
        }
        public char nextChar() throws IOException
        {
            if(tk.hasMoreTokens())
                return (tk.nextToken().charAt(0));
            tk=new StringTokenizer(br.readLine());
            return nextChar();
        }
        public int[] nextIntArray(int n) throws IOException
        {
            int a[]=new int[n];
            for(int i=0;i<n;i++)
                a[i]=nextInt();
            return a;
        }
        public long[] nextLongArray(int n) throws IOException
        {
            long a[]=new long[n];
            for(int i=0;i<n;i++)
                a[i]=nextLong();
            return a;
        }
        public int[] nextIntArrayOneBased(int n) throws IOException
        {
            int a[]=new int[n+1];
            for(int i=1;i<=n;i++)
                a[i]=nextInt();
            return a;
        }
        public long[] nextLongArrayOneBased(int n) throws IOException
        {
            long a[]=new long[n+1];
            for(int i=1;i<=n;i++)
                a[i]=nextLong();
            return a;
        }
    
    
    }

/*///////////////////////////////////////////////////////////*/
		//MERGE SORT

	static void merge(int sort[ ] , int start, int mid, int end) {
 
		int p = start ,q = mid+1;

		int Arr[]=new int[end-start+1] , k=0;

		for(int i = start ;i <= end ;i++) {
    			if(p > mid)      //checks if first part comes to an end or not .
       				Arr[ k++ ] = sort[ q++] ;

   			else if ( q > end)   //checks if second part comes to an end or not
       				Arr[ k++ ] = sort[ p++ ];

   			else if( sort[ p ] < sort[ q ])     //checks which part has smaller element.
      				Arr[ k++ ] = sort[ p++ ];

   			else
      				Arr[ k++ ] = sort[ q++];
 		}
		for (p=0 ; p< k ;p ++) {
     			sort[start++] = Arr[ p ] ;                          
  		}
	}
	static void mergeSort (int A[ ] , int start , int end )
	{
           if( start < end ) {
           int mid = (start + end ) / 2 ;           // defines the current array in 2 parts .
           mergeSort (A, start , mid ) ;                 // sort the 1st part of array .
           mergeSort (A,mid+1 , end ) ;              // sort the 2nd part of array.

         // merge the both parts by comparing elements of both the parts.
          merge(A,start , mid , end );   
         }
    }
  /*  static void mergeSortSerial(int A[], int start, int end)
    {
        int s[]=new int [end+1];
        for(int a=start;a<=end;a++)
            s[a]=a+1;
        
    }

/*///////////////////////////////////////////////////////////*/
    
    
}