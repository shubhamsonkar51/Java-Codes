import java.util.Scanner;
 
class W{

	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int t=in.nextInt();
		int fin[]=new int[t];
		int x=0;
		while(t-->0){
			int n=in.nextInt();
			int no[]=new int[1010];
			int f[]=new int[1010];
			for(int i=0;i<1010;i++){
				no[i]=0;
				f[i]=0;
			}
			for(int i=0;i<n;i++){
				int c=in.nextInt();
				if(no[c]!=0)
					f[c]++;
				else{
					no[c]=1;
					f[c]++;
				}
			}
			int ans=0;
			for(int i=0;i<1009;i++){
				if(f[i]>=2)
					ans++;
				for(int j=i+1;j<1010;j++){
					if(no[i+(j-i)/2]==1)
						ans++;
				}
			}
			fin[x++]=ans;
		}
		for(int i=0;i<t;i++)
			System.out.println(fin[i]);
	}
	
}