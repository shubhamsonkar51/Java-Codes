import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*; 
import java.lang.String;
class solution{
    ////////////////////////////////////////////////////////////////////////////////////////////////////////
    public static int leftinc(int arr[],int i){
        int ii;
        for(int y=i-1;y>=0;y--){
            if(arr[y]!=arr[i]){
                ii=y;
                break;
            }
        }
        return ii;
    }
    public static int rightinc(int arr[],int i){
        int ii;
        for(int y=i+1;y<arr.length;y++){
            if(arr[y]!=arr[i]){
                ii=y;
                break;
            }
        }
        return ii;
    }
  //\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\  
    
 /////////////////////////////////////////////////////////////////////////////////////////////////////////////   
    public static void lowhigh(Vector lh int b[]){
        if(b[0]==b[1]){
            int l=rightinc(b,0);
            lh.add(l);
        }
        else{
            for(int i=0;i<b.length-1;i++){
                if(b[i])
            }
        }
            
    }
  
    public static void func(int b[]){
        Vector lh=new Vector();
        //Vector hi=new Vector();
        lowhigh(lh,b);
        
    }
 //\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\   
    
    
 public static void main(String[] args)throws Exception {
    Scanner in = new Scanner(System.in);
    int t=in.nextInt();
     while(t-->0){
         int n=in.nextInt();
         int a[]=new int[n],b[]=new int[n];
         for(int i=0;i<n;i++){
             a[i]=in.nextInt();
         }
         boolean ac=true,np=false,dec=true,inc=true,flat=true;
         
         //conditions
         for(int i=0;i<n;i++){
             b[i]=in.nextInt();
            if(a[i]!=b[i])
                ac=false;
            if(a[i]<b[i])
                np=true;
            if(i>=1)
                if(b[i]>=b[i-1])
                    dec=false;
             if(i<n-2)
                 if(b[i+1]<=b[i])
                     inc=false;
             if(i<n-2)
                 if(b[i+1]!=b[i])
                     flat=false;
         }
         
         
         if(ac){
            System.out.println("0");
        }
        else if(np){
            System.out.println("-1");
        }
        else if(dec||inc){
            System.out.println(n);
        }
        else if(flat){
            System.out.println("1");
        }
         else
             System.out.println(func(b));
     }
   }
}
