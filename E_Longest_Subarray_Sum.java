import java.util.*;
import java.io.*;

public class E_Longest_Subarray_Sum {
    public static void main(String args[])throws IOException{
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n= Integer.parseInt(st.nextToken());
        int t = Integer.parseInt(st.nextToken());
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        int[] a = new int[n];
        for(int i =0;i<n;i++){
            a[i] =Integer.parseInt(st2.nextToken());
            
        }

    int max =0;
    int sum=0;
    int start=0;
    for(int i =0;i<n;i++){
        sum+=a[i];
        while(sum>t){
            
            sum-=a[start];
            start++;
        }
        max = Math.max(max, i-start+1);
    }
    pw.print(max);
    pw.close();








    }
}
