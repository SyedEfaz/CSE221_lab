import java.util.*;
import java.io.*;
public class C_Fast_Power_Drift{
   

    
    public static int mighty(long a, long b) {
        
        long answer = 1;
        a = a % 107; 

        for (int i=0; b > 0; b = b / 2) {
            
            
            if (b % 2 == 1) {
                answer = answer * a % 107;
            }

            
            a = a * a % 107;
        }

        return (int)answer;
    }


 
    public static void main(String args[])throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        StringTokenizer st = new StringTokenizer(br.readLine());
        Long a =Long.parseLong(st.nextToken());
        Long b =Long.parseLong(st.nextToken());
         pw.print(mighty(a,b));
         pw.flush();
         pw.close();

    }
}