
class test{
/*///////////////////////////////////////////////////////////*/
		//MERGE SORT

	static void merge(int sort[ ] ,int b[], int start, int mid, int end) 
	{
 
		int p = start ,q = mid+1;

		int Arr[]=new int[end-start+1] , k=0;

		for(int i = start ;i <= end ;i++) {
    			if(p > mid)      //checks if first part comes to an end or not .
				{	Arr[k]=sort[q]; b[k]=q; k++; q++; }
				
				else if ( q > end)   //checks if second part comes to an end or not
				{	Arr[k] = sort[ p ]; b[k]=p; k++;p++; }

				else if( sort[ p ] < sort[ q ])     //checks which part has smaller element.
      			{	Arr[ k] = sort[ p]; b[k]=p; k++;p++;}

				else
      			{	Arr[ k] = sort[ q]; b[k]=q; k++;q++;}
 		}
		for (p=0 ; p< k ;p ++) {
     			sort[start] = Arr[ p ] ; 
				//b[start]=ar[p];
				start++;
  		}
	}
	static void mergesort(int A[ ] ,int B[], int start , int end )
	{
           if( start < end ) {
           int mid = (start + end ) / 2 ;           // defines the current array in 2 parts .
           mergesort (A,B, start , mid ) ;                 // sort the 1st part of array .
           mergesort (A,B,mid+1 , end ) ;              // sort the 2nd part of array.

         // merge the both parts by comparing elements of both the parts.
          merge(A,B,start , mid , end );   
		}
    }
	static int[] sortf(int a[],int start, int end)
	{	
		int d[]=new int[a.length];
		for(int i=0;i<a.length;i++)
		{
			d[i]=i;
		}
	   mergesort(a,d,start,end);
        return d;
	}

	public static void main(String ar[]){
		int[] a={10, 20, 14, 15, 54};
		int d[]=sortf(a,0,4);
		for(int i=0;i<5;i++)
			System.out.print(d[i]);
	}
}
