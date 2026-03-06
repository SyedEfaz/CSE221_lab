import java.util.*;
import java.io.*;

public class F_Longest_K_Distinct_Subarray {
 public static void main(String args[])throws IOException{
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 PrintWriter pw = new PrintWriter(System.out);
 StringTokenizer st = new StringTokenizer(br.readLine());
 int n = Integer.parseInt(st.nextToken());
 int k = Integer.parseInt(st.nextToken());
 StringTokenizer st2 = new StringTokenizer(br.readLine());
 int[] a= new int[n];
 int MAX = 10000000;
 for(int i=0;i<n;i++){
    a[i]=Integer.parseInt(st2.nextToken());

 }
int[] feq = new int[MAX+1];
int left=0;
int count=0;
int bestL=0,bestR=0;
int maxlen=0;
for(int right=0;right<n;right++){
   
    if(feq[a[right]]==0){
        count++;
    }
    feq[a[right]]++;
    while(count>k){
        feq[a[left]]--;
        if(feq[a[left]]==0){
            count--;
        }
        left++;
    }
    if(right-left+1>maxlen){
        maxlen=right-left+1;
        bestL=left;
        bestR=right;
    }
}
pw.print(maxlen);
pw.close();
}}