import java.util.*;
class cheglove{
	public static void main(String args[]) throws Exception{
		Scanner in=new Scanner(System.in);
		int t=in.nextInt();
		String ans[]=new String[t];
		for(int a=0;a<t;a++){
			int n=in.nextInt();
			int ch[]=new int[n];
			//int gf[]=new int[n];
			//int gb[]=new int[n];
			int f=1,b=1;
			for(int i=0;i<n;i++)
				ch[i]=in.nextInt();
			for(int i=0;i<n;i++){
				int d=in.nextInt();
				if(d<ch[i])
					f=0;
				if(d<ch[n-i-1])
					b=0;
			}
			if(f==1&&b==1)
				ans[a]="both";
			else if(f==1)
				ans[a]="front";
			else if(b==1)
				ans[a]="back";
			else
				ans[a]="none";
		}
		for(int a=0;a<t;a++){
			System.out.println(ans[a]);
		}
	}
}