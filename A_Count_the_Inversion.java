import java.util.*;
import java.io.*;

public class A_Count_the_Inversion {
    static long cunt;
   public static int[] merge(int[] a,int[]b){
    int n = a.length+b.length;
    int[] ans = new int[n];
    int i=0,j=0,k=0;
    while(i<a.length&&j<b.length){
        if(a[i]<=b[j]){
            ans[k++]=a[i++];
        }
        else{
            ans[k++]=b[j++];
             cunt+=(a.length-i);
        }
    }
    while(i<a.length){
        ans[k]=a[i];
        k++;
        i++;
    }
    while(j<b.length){
        ans[k]=b[j];
        k++;
        j++;

    }
    return ans;

   } 
   public static int[] mergesort(int[] a){
    if(a.length<=1){return a;}
    int mid=a.length/2;
    int[] aleft=new int[mid];
    int[] aright= new int[a.length-mid];
    for(int i=0;i<mid;i++){
        aleft[i]=a[i];
    }
    for(int j=mid;j<a.length;j++){
        aright[j-mid]=a[j];
    }
    aleft=mergesort(aleft);
    aright= mergesort(aright);
    int[] ans =merge(aleft,aright);
    return ans;


   }
   public static void main(String args[])throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter pw= new PrintWriter(System.out);
    int n =Integer.parseInt(br.readLine());
    int[] arr= new int[n];
    StringTokenizer st= new StringTokenizer(br.readLine());
    for(int i=0;i<n;i++){
   arr[i]=Integer.parseInt(st.nextToken());
    }
    arr = mergesort(arr);
    pw.println(cunt);
    for(int i=0;i<arr.length;i++){
        pw.print(arr[i]+" ");
    }
    pw.flush();
    pw.close();

   }
}
