import java.util.*;
import java.io.*;
public class D_Is_Sorted{
public static void main(String args[])throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter pw = new PrintWriter(System.out);
    int t =Integer.parseInt(br.readLine());

    for(int i =0;i<t;i++){

        int  n =Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        Long [] arr= new Long[n];
        for(int j=0;j<n;j++){
            arr[j]=Long.parseLong(st.nextToken());

        }
        int count=0;
        for(int p=0;p<n-1;p++){
         if(arr[p]<=arr[p+1]){
            count++;
         }
        }
        
        if(count==n-1){
            pw.println("YES");
        }
        else{
            pw.println("NO");

        }
        }
 pw.close();




    }

}






