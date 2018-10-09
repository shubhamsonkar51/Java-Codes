import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*; 
import java.lang.String;
class goodpref{
 public static void main(String[] args)throws Exception {
    Scanner in = new Scanner(System.in);
    int t=in.nextInt();
     while(t-->0){
         String ss=in.next();
         String sss=ss;
         long n=in.nextLong();
         long ans=0;
         int str[]=new int[ss.length()];
         for(int i=0;i<ss.length();i++){
             if(ss.charAt(i)=='a')
                 str[i]=1;
             else
                 str[i]=0;
         }
         
         int aa=0,bb=0;
         long good=0,dif=0;
         int len=str.length;
         for(int i=0;i<len;i++){
        	if(str[i]==1)
        		aa++;
        	else
        		bb++;
        	if(aa-bb>0)
        		good++;
        	if(i==(len-1))
        		dif=aa-bb;
        }
         
         if(dif==0){
			ans+=(good*n);
		}
		else if(dif>0){
			if(n<=len){
			for(int i=2;i<=n;i++)
				sss+=ss;
            int fin[]=new int[sss.length()];
            for(int i=0;i<fin.length;i++){
                if(sss.charAt(i)=='a')
                 fin[i]=1;
                else
                 fin[i]=0;
            }
			int finlen=fin.length;
			aa=0;bb=0;
			//cout<<fin<<"   fin"<<endl;
        	for(int i=0;i<finlen;i++){
        		if(fin[i]==1)
        			aa++;
        		else
        			bb++;
        	    if(aa-bb>0)
        			ans++;
        	}
		}
		else{
			//char fin[1000010];
			for(int i=2;i<=len;i++)
				sss+=ss;
            int fin[]=new int[sss.length()];
            for(int i=0;i<fin.length;i++){
                if(sss.charAt(i)=='a')
                 fin[i]=1;
                else
                 fin[i]=0;
            }
			int finlen=fin.length;
			aa=0;bb=0;
        	for(int i=0;i<finlen;i++){
        		if(fin[i]==1)
        			aa++;
        		else
        			bb++;
        	    if(aa-bb>0)
        			ans++;
        	}
        	ans+=(len*(n-len));			
		}
		}
		else{
			if(n<=len){
			for(int i=2;i<=n;i++)
				sss+=ss;
            int fin[]=new int[sss.length()];
            for(int i=0;i<fin.length;i++){
                if(sss.charAt(i)=='a')
                 fin[i]=1;
                else
                 fin[i]=0;
            }
			int finlen=fin.length;
			aa=0;bb=0;
			//cout<<fin<<"   fin"<<endl;
        	for(int i=0;i<finlen;i++){
        		if(fin[i]==1)
        			aa++;
        		else
        			bb++;
        	    if(aa-bb>0)
        			ans++;
        	}
		}
		else{
			//char fin[1000010];
			for(int i=2;i<=len;i++)
				sss+=ss;
            int fin[]=new int[sss.length()];
            for(int i=0;i<fin.length;i++){
                if(sss.charAt(i)=='a')
                 fin[i]=1;
                else
                 fin[i]=0;
            }
			int finlen=fin.length;
			aa=0;bb=0;
        	for(int i=0;i<finlen;i++){
        		if(fin[i]==1)
        			aa++;
        		else
        			bb++;
        	    if(aa-bb>0)
        			ans++;
        	}			
		}
		}
         
         
         
         
         
         System.out.println(ans);
         
     }
   }
}
