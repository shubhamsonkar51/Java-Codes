import java.util.*;
class mixcolor{
	
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