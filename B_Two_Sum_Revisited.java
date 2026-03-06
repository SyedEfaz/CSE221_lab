import java.util.*;
import java.io.*;
public class B_Two_Sum_Revisited{
public static void main(String args[])throws IOException{
BufferedReader br= new BufferedReader( new InputStreamReader(System.in));
PrintWriter pw = new PrintWriter(System.out);
StringTokenizer st = new StringTokenizer(br.readLine());
int n1 =Integer.parseInt(st.nextToken());
int n2 =Integer.parseInt(st.nextToken());
int t= Integer.parseInt(st.nextToken());
int[] a= new int[n1];
StringTokenizer st1 = new StringTokenizer(br.readLine());
for(int i =0;i<n1; i++){
a[i]=Integer.parseInt(st1.nextToken());
    


}
int[]b =new int[n2];
StringTokenizer st2 = new StringTokenizer(br.readLine());
for(int j=0;j<n2;j++){
b[j]= Integer.parseInt(st2.nextToken());
}
int p=0;
int q=n2-1;
int min =Integer.MAX_VALUE;
int ansp=0;
int ansq=0;


while((p<n1)&&(q>=0)){
   int k = a[p]+b[q];
   int diff =Math.abs(k-t);
if(diff<min){
    min=diff;
    ansp=p;
    ansq=q;
}
if(k<t){
    p++;
}
else {
    q--;
}
}
pw.println((ansp+1)+" "+(ansq+1));
pw.close();
}
}




















