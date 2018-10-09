import java.io.*;
import java.util.*;
import java.lang.Math;
 
class shknum {

 
    public static void main(String args[]) throws IOException
    {
       Scanner in =new Scanner(System.in);
	   int t=in.nextInt();
	   long c[]=new long[35];
	   c[0]=1;
	   for(int i=1;i<35;i++){
		   c[i]=2*c[i-1];
	   }
	   //long k=1000000007;
	   while(t-->=1){
		   long n=in.nextLong();
		   for(int i=0;i<34;i++){
			   if(n>=c[i]&&n<=c[i+1]){
				   if(n==c[i]||n==c[i+1]){
					   if(n>=4)
							if(n==c[i])
								System.out.println(c[i-2]);
							else
								System.out.println(c[i-1]);
					   else if(n==2)
						   System.out.println("1");
					   else
						   System.out.println("2");
				   }
				   else{
					   long c1=0,c2=0,n1=0,n2=0;
					   n1=(n-c[i]<=c[i+1]-n)?(n-c[i]):(c[i+1]-n);
					   n2=(n-c[i]<=c[i+1]-n)?(c[i+1]-n):(n-c[i]);
					   for(int j=0;j<34;j++){
							if(n1>=c[j]&&n1<=c[j+1]){
								if(n1==c[j]||n1==c[j+1]){
									break;
								}
								else{
									c1=(n1-c[j]<=c[j+1]-n1)?(n1-c[j]):(c[j+1]-n1);
								}
							}
						}
						for(int k=0;k<34;k++){
							if(n2>=c[k]&&n2<=c[k+1]){
								if(n2==c[k]||n2==c[k+1]){
									break;
								}
								else{
									c2=(n2-c[k]<=c[k+1]-n2)?(n2-c[k]):(c[k+1]-n2);
								}
							}
						}
						if(c1<c2)
							System.out.println(c1);
						else
							System.out.println(c2);
					   
				   }
				   break;
			   }
		   }
		   
	   }
	   
	   
    }
}