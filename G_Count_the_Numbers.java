
import java.io.*;
import java.util.*;


public class G_Count_the_Numbers {
    public static int upperboud(int[] arr,int a){
        int low =0;
        int high=arr.length;
        
        while(low<high){
            int mid =(low+high)/2;
            if(arr[mid]<=a){
                low=mid+1;
            }
            else if(arr[mid]>a){
                high=mid;
            }
        }
        return low;
    }
    public static int lowerbund(int[] a, int val){
        int low =0;
        int high =a.length;
        
        while(low<high){
            int mid =(low+high)/2;
            if(a[mid]<val){
             low =mid+1;

            }
            else if(a[mid]>=val){
                high =mid;
            }
        }
        return low;
    }
    public static void main(String args[])throws IOException{
        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);

        StringTokenizer st = new StringTokenizer(br.readLine());
        int t = Integer.parseInt(st.nextToken());
        int k =Integer.parseInt(st.nextToken());
        st= new StringTokenizer(br.readLine());
        int[] b = new int[t];
        for(int i =0;i<t;i++){
            b[i]= Integer.parseInt(st.nextToken());
        }
      while(k-->0){
        st= new StringTokenizer(br.readLine());
         int x=Integer.parseInt(st.nextToken());
          int y = Integer.parseInt(st.nextToken());
         int count =upperboud(b, y)-lowerbund(b,x);
         pw.println(count);

      }
      pw.flush();
      pw.close();
        

    }
}
    
   