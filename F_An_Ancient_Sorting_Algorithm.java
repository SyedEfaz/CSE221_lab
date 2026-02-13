import java.io.*;
import java.util.*;

public class F_An_Ancient_Sorting_Algorithm{
public static void main(String args[]) throws IOException{

BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
PrintWriter pw = new PrintWriter(System.out);
int t= Integer.parseInt(br.readLine());
StringTokenizer st = new StringTokenizer(br.readLine());
int[] arr = new int[t];
for(int i =0;i<t;i++){
    arr[i]= Integer.parseInt(st.nextToken());
}
for(int pass=0;pass<t;pass++){
    for(int i =0;i<t-1;i++){

   
   if(arr[i]>arr[i+1]&& ((arr[i]%2==0&&arr[i+1]%2==0)|| (arr[i]%2!=0&&arr[i+1]%2!=0))){
    int temp =arr[i];
    arr[i]=arr[i+1];
    arr[i+1]=temp;

   }

    


}}
for(int i =0;i<t;i++){
    pw.print(arr[i]+" ");
}
pw.close();






}}
