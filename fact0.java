import java.util.*;
import java.lang.*;
class fact0{
	public static void main(String ar[])throws Exception{
		Scanner in=new Scanner(System.in);
		while(true){
			long n=in.nextLong();
			if(n==0)
				break;
			else{
				long c=0;
				while(n%2==0){
					c++;
					n/=2;
				}
				if(c>0)
					if(n==1)
						System.out.print("2^"+c);
					else 
						System.out.print("2^"+c+" ");
				for(long i=3;i<=Math.sqrt(n);i+=2){
					c=0;
					while(n%i==0){
						c++;
						n/=i;
					}
					if(c>0)
						if(n==1)
							System.out.print(i+"^"+c);
						else 
							System.out.print(i+"^"+c+" ");
				}
				if(n>2)
					System.out.print(n+"^1");
			}
		}
	}
}