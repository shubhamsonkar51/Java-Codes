import java.util.Scanner;
 
class avgpr{

	public static void main(String[] args)throws Exception{
		Scanner in=new Scanner(System.in);
		int t=in.nextInt();
		int fin[]=new int[t];
		int x=0;
		int dup=t;
		while(dup-->0){
			int n=in.nextInt();
			int no[]=new int[2021];
			int f[]=new int[2021];
			
			for(int i=0;i<2021;i++){
				no[i]=0;
				f[i]=0;
			}
			for(int i=0;i<n;i++){
				int l=in.nextInt();
				int c=l+1010;
				if(no[c]!=0)
					f[c]++;
				else{
					no[c]=1;
					f[c]++;
				}
			}
			/*for(int i=0;i<1010;i++){
				if(no[i]==1)
					System.out.println(n+"     "+i+"    "+f[i]);
			}*/
			int ans=0;
			for(int l=-1010;l<1008;l++){
				int i=l+1010;
				if(f[i]>=2)
					ans++;
				for(int r=l+2;r<1010;r+=2){
					int j=r+1010;
					if(no[i]==1&&no[j]==1&&no[(i+j)/2]==1)
						ans+=f[i]*f[j];
				}
			}
			fin[x++]=ans;
		}
		for(int i=0;i<t;i++)
			System.out.println(fin[i]);
	}
	
}