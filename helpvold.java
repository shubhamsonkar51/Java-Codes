import java.util.*;
class helpvold{
	
	public static void merge(long A[ ] , int start, int mid, int end) {
 //stores the starting position of both parts in temporary variables.
int p = start ,q = mid+1;

long Arr[]=new long[end-start+1];
         int k=0;

for(int i = start ;i <= end ;i++) {
    if(p > mid)      //checks if first part comes to an end or not .
       Arr[ k++ ] = A[ q++] ;

   else if ( q > end)   //checks if second part comes to an end or not
       Arr[ k++ ] = A[ p++ ];

   else if( A[ p ] < A[ q ])     //checks which part has smaller element.
      Arr[ k++ ] = A[ p++ ];

   else
      Arr[ k++ ] = A[ q++];
 }
  for ( p=0 ; p< k ;p ++) {
   /* Now the real array has elements in sorted manner including both 
        parts.*/
     A[ start++ ] = Arr[ p ] ;                          
  }
}
  public static void merge_sort (long A[ ] , int start , int end )
   {
           if( start < end ) {
           int mid = (start + end ) / 2 ;           // defines the current array in 2 parts .
           merge_sort (A, start , mid ) ;                 // sort the 1st part of array .
           merge_sort (A,mid+1 , end ) ;              // sort the 2nd part of array.

         // merge the both parts by comparing elements of both the parts.
          merge(A,start , mid , end );   
   }                    
}   
	
	
	public static void main(String ar[])throws Exception{
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		long arr[]=new long[n];
		//long max=-1,min=100000000;
		//int maxi=-1,mini=-1;
		for(int i=0;i<n;i++){
			arr[i]=in.nextInt();
			/*if(arr[i]>=max){
				max=arr[i];
				maxi=i;
			}
			if(arr[i]<=min){
				min=arr[i];
				mini=i;
			}*/
		}
		merge_sort(arr,0,n-1);
		long p=0;
		//int i=mini<maxi?mini:maxi;
		//int j=maxi>mini?maxi:mini;
		//p=arr[i];
		//++i;
		for(int i=0;i<n-1;i++)
			p=p+arr[i]*arr[i+1];
		System.out.print(p);
	}
}