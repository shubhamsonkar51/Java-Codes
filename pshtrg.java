import java.util.*;
class pshtrg{
	public static void main(String args[]) throws Exception{
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int q=in.nextInt();
		long arr[]=new long[n];
		long ans[]=new long[q];
		for(int i=0;i<n;i++)
			arr[i]=in.nextLong();
		for(int i=0;i<q;i++)
			ans[i]=-1L;
		int c=0;
		for(int a=0;a<q;a++){
			if(in.nextInt()==1){
				int i=in.nextInt();
				arr[i-1]=in.nextLong();
			}
			else{
				int l=in.nextInt();
				int r=in.nextInt();
				if(r-l<2)
					ans[c++]=0L;
				else{
					long arrd[]=new long[r-l+1];
					for(int j=0,i=l-1;i<r;i++,j++)
						arrd[j]=arr[i];
					mergesort(arrd,0,r-l);
					long sum=0L,large=0L;
					for(int i=r-l;i>=2;i--){
						if(arrd[i-2]+arrd[i-1]>arrd[i]){
							sum=arrd[i-2]+arrd[i-1]+arrd[i];
							if(large<sum)
								large=sum;
						}			
					}
					if(large==0)
						ans[c++]=0;
					else
						ans[c++]=large;
				}
			}
		}
		for(int i=0;i<q;i++){
			if(ans[i]==-1)
				break;
			else
				System.out.println(ans[i]);
		}
		
		
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
}