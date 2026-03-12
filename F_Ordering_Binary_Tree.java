import java.io.*;
import java.util.*;
public class F_Ordering_Binary_Tree{
    public static void main(String[] args)throws IOException{
     BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
     PrintWriter pw = new PrintWriter(System.out);
     int n =Integer.parseInt(br.readLine());
     StringTokenizer st = new StringTokenizer(br.readLine());
     int[] a = new int[n];
      for(int i =0;i<n;i++){
        a[i]=Integer.parseInt(st.nextToken());

      }
     ArrayList<Integer> newOrder= new ArrayList<>();
     buildOrder(a,0,n-1,newOrder);
     for(int x :newOrder){
        pw.print(x+" ");

     }
     pw.close();
    }
    public static void buildOrder(int[] a,int first,int last,ArrayList<Integer> newOrder){
        if(first>last){return;}
        int mid =(first+last)/2;
        newOrder.add(a[mid]);
        buildOrder(a,first,mid-1,newOrder);
        buildOrder(a,mid+1,last,newOrder);
    }
}
