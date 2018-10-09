import java.util.*;
import java.lang.*;
class chefwork{
	public static void main(String ar[])throws Exception{
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int c[]=new int[n];
		int t[]=new int [n];
		int m3=10000000,m2=10000000,m1=10000000,mm3=-1,mm2=-1,mm1=-1;
		for(int i=0;i<n;i++){
			c[i]=in.nextInt();
		}
		for(int i=0;i<n;i++){
			t[i]=in.nextInt();
			if(t[i]==3&&c[i]<m3){
				m3=c[i];
				mm3=i;
			}
			if(t[i]==2&&c[i]<m2){
				m2=c[i];
				mm2=i;
			}
			if(t[i]==1&&c[i]<m1){
				m1=c[i];
				mm1=i;
			}
		}
		if(m2+m1<m3)
			System.out.print(m2+m1);
		else
			System.out.print(m3);
		
		
		
			
		
	}
}
