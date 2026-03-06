import java.util.*;
import java.io.*;
public class H_Searching_is_Fun{
    public static void main(String args[])throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
     int t= Integer.parseInt(br.readLine());
     while(t-->0){
        StringTokenizer st = new StringTokenizer(br.readLine());
        long k= Integer.parseInt(st.nextToken());
        long p= Integer.parseInt(st.nextToken());

        Long ans;
        if(p==1){
            ans=k;

        }
        else{
            ans =k+(k-1)/(p-1);
        }
        pw.println(ans);
     }
     pw.flush();
    }
}