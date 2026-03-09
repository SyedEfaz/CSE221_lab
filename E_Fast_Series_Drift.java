import java.io.*;
import java .util.*;
public class E_Fast_Series_Drift{
public static long pow(long a,long n,long m){
    long ans =1;
    a=a%m;
    while(n>0){
        if(n%2==1){
            ans = (ans*a)%m;
        }
        a=(a*a)%m;
        n=n/2;
    }
    return ans;
}
public static  long powsum(long a ,long n ,long m){
    if(n==0){ return 0;}
    if(n==1){return a%m;}
    long mid =n/2;
    long s =powsum(a,mid,m);
    long pow_mid=pow(a,mid,m);
    if(n%2==0){
        return (s+(pow_mid*s)%m)%m;

    }
    else{
        return (s+(pow_mid*s)%m+pow(a,n,m))%m;
    }



}
public static void main(String[] args)throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter out = new PrintWriter(System.out);
    int t = Integer.parseInt(br.readLine());
    while(t-->0){
        StringTokenizer st = new StringTokenizer(br.readLine());
        long a =Long.parseLong(st.nextToken());
        long b = Long.parseLong(st.nextToken());
        long c = Long.parseLong(st.nextToken());
        out.println(powsum(a,b,c));

    }
out.flush();
out.close();
}
}