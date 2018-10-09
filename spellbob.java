import java.io.*;
import java.util.*;
 
class spellbob {

 
    public static void main(String args[]) throws IOException
    {
       Scanner in =new Scanner(System.in);
	   int q=in.nextInt();
	   while(q-->=1){
	   String t=in.next();
	   String b=in.next();
	   if(((t[0]=='b'||b[0]=='b')&&(t[1]=='o'||b[1]=='o')&&(t[2]=='b'||b[2]=='b'))||((t[0]=='o'||b[0]=='o')&&(t[1]=='b'||b[1]=='b')&&(t[2]=='b'||b[2]=='b'))||((t[0]=='b'||b[0]=='b')&&(t[1]=='b'||b[1]=='b')&&(t[2]=='o'||b[2]=='o')))
		System.out.println("yes");
		else
			System.out.println("no");
		}
    }
}