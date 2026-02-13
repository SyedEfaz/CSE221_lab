
import java.util.*;
import java.io.*;

public class E {
    static int count=0;
    static ArrayList<int[]> al = new ArrayList<>();

    public static void reversearr(int p, int q,int[] arr){
        count++;
        al.add(new int[]{p+1,q+1});
      while(p<q){


        int temp=arr[p];
        arr[p]=arr[q];
        arr[q]=temp;
        p++;
        q--;
      }
     



    }
    public static boolean is(int[] arr){
        
        for(int i =0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
             return false;
            }
        }
        return true;
    }
    public static void main(String args[]) throws IOException{
     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     PrintWriter pw= new PrintWriter(System.out);
     int t= Integer.parseInt(br.readLine());
     StringTokenizer st = new StringTokenizer(br.readLine());
     int[] arr = new int[t];
     for(int i =0; i<t;i++){
        arr[i]= Integer.parseInt(st.nextToken());

     }
   
     
     boolean s =true;
    int safety =t*t;
    while(!is(arr)&& s&& safety>0){
    s= false;
    
     for(int p=0;p+2<t;p++){
      
    if(arr[p]>arr[p+2]){
        reversearr(p,p+2,arr);
        s=true;
    }
    
    
    
    
    
    }}

    if(is(arr)){
        pw.println("YES");
        pw.println(count);
        for(int[] a:al){
            pw.println(a[0]+" "+a[1]);
        }

    }
    else{
        pw.println("NO");




    }

    pw.flush();
    pw.close();
   
    
}}
