import java.util.*;
import java.io.*;
public class D_Fast_Matrix_Drift {
    public static final long mod=1000000007;
    public static long[][] multiply(long[][] a,long[][]b){
        long[][] c = new long[2][2];
        c[0][0]=((a[0][0]*b[0][0])%mod+(a[0][1]*b[1][0])%mod)%mod;
        c[0][1]=((a[0][0]*b[0][1])%mod+(a[0][1]*b[1][1])%mod)%mod;
        c[1][0]=((a[1][0]*b[0][0])%mod+(a[1][1]*b[1][0])%mod)%mod;
        c[1][1]=((a[1][0]*b[0][1])%mod+(a[1][1]*b[1][1])%mod)%mod;
   return c;

    }

    public static long[][] power(long[][] arr,long x){
 long[][] result={{1,0},{0,1}};
 while(x>0){
    if(x%2!=0){
        result=multiply(result,arr);

    }
    arr=multiply(arr,arr);
   x=x/2;
 }
 return result;
    }
    public static void main(String args[])throws IOException{
        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        int n = Integer.parseInt(br.readLine());
        for(int i =0;i<n;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            long a11=Long.parseLong(st.nextToken());
            long a12 =Long.parseLong(st.nextToken());
            long a21 =Long.parseLong(st.nextToken());
            long a22=Long.parseLong(st.nextToken());
            long[][] arr= {{a11,a12},{a21,a22}};


        
        Long x = Long.parseLong(br.readLine());
        long[][] ans = power(arr,x);
        pw.println(ans[0][0]+" "+ans[0][1]);
        pw.println(ans[1][0]+" "+ans[1][1]);

    }
    pw.flush();
    pw.close();


}}
