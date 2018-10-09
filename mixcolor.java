import java.util.*;
class mixcolor{
	
	
	int binarySearch(long arr[], int l, int r, long x)
    {
        if (r>=l)
        {
            int mid = l + (r - l)/2;

            // If the element is present at the 
            // middle itself
            if (arr[mid] == x)
               return mid;

            // If element is smaller than mid, then 
            // it can only be present in left subarray
            if (arr[mid] > x)
               return binarySearch(arr, l, mid-1, x);

            // Else the element can only be present
            // in right subarray
            return binarySearch(arr, mid+1, r, x);
        }

        // We reach here when element is not present
        //  in array
        return -1;
    }
	
	
	
	
	
	
	
	
	static void merge(long sort[ ] , int start, int mid, int end) {
 
		int p = start ,q = mid+1;

		long Arr[]=new long[end-start+1];
		int k=0;

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
	static void mergesort(long A[ ] , int start , int end )
	{
           if( start < end ) {
           int mid = (start + end ) / 2 ;           // defines the current array in 2 parts .
           mergesort (A, start , mid ) ;                 // sort the 1st part of array .
           mergesort (A,mid+1 , end ) ;              // sort the 2nd part of array.

         // merge the both parts by comparing elements of both the parts.
          merge(A,start , mid , end );   
	}
    }
	
	public static void main(String args[]) throws Exception{
		Scanner in=new Scanner(System.in);
		int t=in.nextInt();
		int ans[]=new int[t];
		//double ans[]=new double[t];
		for(int a=0;a<t;a++){
			int n=in.nextInt();
			long arr[]=new long[n];
			for(int i=0;i<n;i++)
				arr[i]=in.nextLong();
			mergesort(arr, 0, n-1);
			int count=0;
			for(int i=0;i<n-1;i++){
				if(arr[i]==arr[i+1])
					count++;
			}
			ans[a]=count;
		}
		
		for(int a=0;a<t;a++){
			System.out.println(ans[a]);
		}
		
	}
}