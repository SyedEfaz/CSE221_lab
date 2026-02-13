import java.util.*;
import java.io.*;
public class C_Fast_Sum{
public static void main(String args[])throws IOException{
BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
PrintWriter pw =new PrintWriter(System.out);
int a = Integer.parseInt(br.readLine());
for(int j =0;j<a;j++){

long n =Long.parseLong(br.readLine());
Long ans =(n*(n+1))/2;
pw.println(ans);



}

pw.close();
pw.flush();



}







}