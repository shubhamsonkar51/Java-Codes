import java.util.*;
import java.lang.Math;
class minvote{
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
			int arrd[][]=new int[n][n];
			arrd[0][0]=arr[0];
			for(int i=1;i<n;i++)
				arrd[0][i]=(arrd[0][i-1])+(arr[i]);
			for(int i=1;i<n;i++){
				for(int j=0;j<n;j++){
					if(j<i||j==n-1)
						arrd[i][j]=0;
					else if(i==j)
						arrd[i][j]=arr[i];
					else{
						arrd[i][j]=arrd[i-1][j]-arrd[i-1][i-1];
					}
					
				}
			}
			/*for(int i=0;i<n;i++){
				for(int j=0;j<n;j++)
					System.out.print(arrd[i][j]+ " ");
				System.out.println();
			}*/
			int c=0;
			for(int i=0;i<n;i++){
				c=0;
				for(int j=0;j<n&&j!=i;j++){
					if(Math.abs(j-i)>1){ if(i<j){ if(arr[j]>arrd[i+1][j-1]) c++; }
						else
							if(arr[j]>arrd[i-1][j+1])
								c++;
					}
					else 
						c++;
				}
				ans[a]+=c+" ";
			}
		}
		for(int i=0;i<t;i++)
			System.out.println(ans[i].trim());
		
		
	}
}