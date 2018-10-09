import java.util.*;
import java.lang.Math;
class minvotenew{
	public static void main(String args[]) throws Exception{
		Scanner in=new Scanner(System.in);
		int t=in.nextInt();
		String ans[]=new String[t];
		for(int a=0;a<t;a++){
			ans[a]=" ";
			int n=in.nextInt();
			int arr[]=new int[n];
			for(int j=0;j<n;j++)
				arr[j]=in.nextInt();
		/*	int arrd[]=new int[n];
			arrd[0]=arr[0];
			for(int i=1;i<n;i++)
				arrd[i]=arrd[i-1]+arr[i];    //sum aa gya arrd  me
			
			/*for(int i=0;i<n;i++){
				
					System.out.print(arrd[i]+ " ");
				System.out.println();
			}*/
			
			
			int c=0;
			for(int i=0;i<n;i++){
				c=0;
				for(int j=0;j<n&&j!=i;j++){
					if((j-i>1)||(i-j>1)){
						long sum=0L;
						int small=i<j?i:j;
						int big=i<j?j:i;
						for(int x=small+1;x<big;x++)
							sum+=arr[x];
						System.out.println(sum);
						if(arr[j]>=sum)
							c++;
						
					}
					else 
						c++;
				}
				ans[a]+=c+" ";
			}
		}
		System.out.println();
		System.out.println();
		for(int i=0;i<t;i++)
	System.out.println(ans[i].trim());
		
		
	}
}