import java.util.*;
import java.math.*;
import java.io.*;
class gcdmod{
static long gcd(long a, long b)
{
    if (a == 0)
        return b;
    return gcd(b%a, a);
}


static long power(long x, long y, long p)
    {
        long res = 1;    
        x = x % p; 
     
        while (y > 0)
        {
            if((y%2 )==1)
                res = (res * x) % p;
            y = y/2; 
            x = (x * x) % p; 
        }
        return res%p;
    }
static long powe(long x, long y, long p){
	BigInteger a=BigInteger.valueOf(x),b=BigInteger.valueOf(y),c=BigInteger.valueOf(p);
	BigInteger res= new BigInteger("1");
	BigInteger bi2=new BigInteger("2");
	BigInteger bi1=new BigInteger("1");
	BigInteger bi0=new BigInteger("0");
	a=a.mod(c);
	while(b.compareTo(bi0)==1){
		if(b.mod(bi2)==bi1)
			res=(res.multiply(a)).mod(c);
		b=b.divide(bi2);
		a=a.mod(c);
		a=a.multiply(a).mod(c);
	}
	return (res.mod(c)).longValue();
}


public static void main(String ar[])throws IOException{
	Scanner in=new Scanner(System.in);
	long k=1000000007;
	long kk=10000000000L;
	long t=in.nextLong();
	while(t-->=1){
		long a=in.nextLong(),b=in.nextLong(),n=in.nextLong();
		if(a-b==0){
			long l=((powe(a,n,k)%k)+(powe(b,n,k)%k))%k;
			System.out.println(l);
		}
		else{
			long p=(a-b);
			if(a>kk){
				
				long l1=powe(a,n,p)%p;
				//System.out.println(l1+"l1 ");
				long l2=powe(a,n,p)%p;
				//System.out.println(l2+"l2 ");
				long l=(l1+l2)%p;
				System.out.println(gcd(l,(a-b))%k);
			}
			else{
				long l1=(power(a,n,p)%p);
				long l2=(power(b,n,p)%p);
				long l=(l1+l2)%p;
				System.out.println(gcd(l,(a-b))%k);
			}
			
		}
			
	}
}  
}