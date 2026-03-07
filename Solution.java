import java.io.*;
import java.util.*;
public class Solution{
public static void main(String args[])throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter pw= new PrintWriter(System.out);
    int N = Integer.parseInt(br.readLine());
    StringTokenizer st ;
    while(N-->0){
        st = new StringTokenizer(br.readLine());
      int n = Integer.parseInt(st.nextToken());
      int m = Integer.parseInt(st.nextToken());
      int l =Integer.parseInt(st.nextToken());
      int k = Integer.parseInt(st.nextToken());
      int[] a = new int[n];
      int[] b=new int[m];
      int [] c= new int[l];
      st=new StringTokenizer(br.readLine());
      for(int i=0;i<n;i++){
        a[i]=Integer.parseInt(st.nextToken());

      }
      st = new StringTokenizer(br.readLine());
      for(int j =0;j<m;j++){
        b[j]=Integer.parseInt(st.nextToken());
      }
      st=new StringTokenizer(br.readLine());
      for(int p=0;p<l;p++){
        c[p]=Integer.parseInt(st.nextToken());
      }
      int i =0,j=0,x=0;
      int ans=0;
      while(k-->0){
        int va =(i<n)?a[i] :Integer.MAX_VALUE;
        int vb =(j<m)?b[j] :Integer.MAX_VALUE;
        int vc =(x<l)?c[x]:Integer.MAX_VALUE;

       if (va<=vb&&va<=vc){
        ans=va;
        i++;
       }
       else if(vb<=vc&&vb<=va){
        ans=vb;
        j++;
       }
       else if(vc<=va&&vc<=vb){
        ans=vc;
        x++;
      

      }
      

      
    }
    pw.println(ans);
 
}
pw.close();
}}
