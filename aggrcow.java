import java.util.*;
import java.lang.*;
class aggrcow{
	
		static void merge(int sort[ ] , int start, int mid, int end) {
 
		int p = start ,q = mid+1;

		int Arr[]=new int[end-start+1];
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
	static void mergesort(int A[ ] , int start , int end )
	{
           if( start < end ) {
           int mid = (start + end ) / 2 ;           // defines the current array in 2 parts .
           mergesort (A, start , mid ) ;                 // sort the 1st part of array .
           mergesort (A,mid+1 , end ) ;              // sort the 2nd part of array.

         // merge the both parts by comparing elements of both the parts.
          merge(A,start , mid , end );   
	}
    }
	
	static int func(int num,int array[],int c)
{
    int cows=1,pos=array[0];
    for (int i=1; i<array.length; i++)
    {
        if (array[i]-pos>=num)
        {
            pos=array[i];
            cows++;
            if (cows==c)
                return 1;
        }
    }
    return 0;
}
	
	
	public static void main(String ar[])throws Exception{
		Scanner in=new Scanner(System.in);
		int t=in.nextInt();
		int ans[]=new int[t],d=0; 
		while(t-->0){
			int n=in.nextInt();
			int c=in.nextInt();
			int arr[]=new int[n];
			for(int i=0;i<n;i++){
				arr[i]=in.nextInt();
			}
			mergesort(arr,0,n-1);
			int l=0,r=arr[n-1],max=-1;
			while(r-l>1){
				 int mid=l+(r-l)/2;
				if (func(mid,arr,c)==1){
					if (mid>max)
						max=mid;
					l=mid+1;
				}
				else
					r=mid;
			}
			ans[d++]=max;
			
		}
		for(int i=0;i<t;i++){
			System.out.println(ans[i]);
		}

	}
}
