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
			for(int j=0;j<6&&arr[i].length()>=2;j++){
				int c=ans;
				for(int x=0;x<arr[i].length()-1;x++){
					if(arr[i].charAt(x)=='c'&&arr[i].charAt(x+1)=='h')
						{ans++;break;}
				}
				if(ans>c)
					break;
				for(int x=0;x<arr[i].length()-1;x++){
					if(arr[i].charAt(x)=='h'&&arr[i].charAt(x+1)=='e')
						{ans++;break;}
				}
				if(ans>c)
					break;
				//if(arr[i].length()>=2)
				for(int x=0;x<arr[i].length()-1;x++){
					if(arr[i].charAt(x)=='e'&&arr[i].charAt(x+1)=='f')
						{ans++;break;}
				}
				if(ans>c)
					break;
			}
		}
		System.out.print(ans);
			
		
	}
}
