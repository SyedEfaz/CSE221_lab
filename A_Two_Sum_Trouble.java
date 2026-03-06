import java.util.*;
import java.io.*;



public class A_Two_Sum_Trouble {

public static void main (String args[])throws IOException{
BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
StringTokenizer st = new StringTokenizer(br.readLine());

int n= Integer.parseInt(st.nextToken());
int t =Integer.parseInt(st.nextToken());
int[] a= new int[n];
for(int i=0;i<n;i++){
    a[i]=Integer.parseInt(st.nextToken());
}
int p=0;
int q=n-1;
while(p<q){
    if((a[p]+a[q])<t){
        p++;
    }
    else if((a[p]+a[q])>t){
        q--;
    }
    else if((a[p]+a[q])==t){
        System.out.print(p+" "+q);
        break;
    }
}
System.out.print("-1");



}


    public static void main(string args)throws IOException{}
    
}