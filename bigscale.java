import java.util.*;
class bigscale{
	public static void main(String args[]) throws Exception{
		Scanner in=new Scanner(System.in);
		int t=in.nextInt();
		double ans[]=new double[t];
		for(int a=0;a<t;a++){
			int n=in.nextInt();
			double sum=0;
			for(int b=0;b<n;b++){
				double p=in.nextDouble();
				int q=in.nextInt();
				double d=in.nextDouble();
				double dd=(100+d);
				dd=dd-(dd*(d/100));
				double pp=p*(dd/100);
				//System.out.println(pp);
				sum+=(p-pp)*q;
				
			}
			ans[a]=sum;
		}
		for(int a=0;a<t;a++){
			System.out.println(ans[a]);
		}

	}
}