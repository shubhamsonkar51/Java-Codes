import java.util.*;
import java.lang.*;
class solution{
	public static void main(String ar[])throws Exception{
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		String arr[]=new String[n];
		int ans=0;
		for(int i=0;i<n;i++){
			arr[i]=in.nextLine();
			for(int j=0;j<arr[i].length()-1;j++){
				String c=arr[i].substring(j,j+2);
				//c.concat(arr[i].charAt(j));
				//c.concat(arr[i].charAt(j+1));
				System.out.println(c);
				if(c.equals("ch")||c.equals("he")||c.equals("ef")){
					ans++;
					break;
				}
			}
		}
		System.out.print(ans);
			
		
	}
}