import java.util.*;
import java.io.*;
public class D_A_Beautiful_Sorted_List{
    public static void main(String args[])throws IOException{
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
       
        int n =Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        Long[] a= new Long[n];
        for(int i =0;i<n;i++){
            a[i]=Long.parseLong(st.nextToken());

        }
        int m=Integer.parseInt(br.readLine());
        Long[] b = new Long[m];
      StringTokenizer st2 = new StringTokenizer(br.readLine());

      for(int j=0;j<m;j++){
        b[j]=Long.parseLong(st2.nextToken());
      }
      int i=0;
      int  j=0;
      int k=0;
      Long [] ans =new Long[n+m];
      while(i<n&&j<m){
        if(a[i]<b[j]){
          ans[k++]=a[i++];
        }
        else{
          ans[k++]=b[j++];
        }
      }
      while(i<n){
        ans[k++]=a[i++];
      }
      while(j<m){
        ans[k++]=b[j++];
      }
      for(int x=0;x<n+m;x++){
        pw.print(ans[x]+" ");
      }
     pw.close();
    }
    
}