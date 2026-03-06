import java.util.*;

import java.io.*;

public class C_Triple_The_Trouble{
    public static void arrange(helper[] a){
        int n =a.length;
        for(int i=0;i<n-1;i++){
            int min=i;
            for(int j=i+1;j<n;j++){
                if(a[j].val<a[min].val){
                    min=j;

                }
            }
            helper temp = a[i];
            a[i]=a[min];
            a[min]=temp;
        }
    }
   public static class helper{
    int val;
    int idx;
    public helper(int val,int idx){
        this.val=val;
        this.idx =idx;

    }
   }
public static void main(String args[])throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter pw = new PrintWriter(System.out);
    StringTokenizer st = new StringTokenizer(br.readLine());
    int n =Integer.parseInt(st.nextToken());
    int t=Integer.parseInt(st.nextToken());
    helper[] a = new helper[n];
    StringTokenizer st2 = new StringTokenizer(br.readLine());
    for(int i=0;i<n;i++){
        a[i]=new helper(Integer.parseInt(st2.nextToken()),i+1);
    }
   arrange(a);
   
    boolean ok = false;
    for(int i=0;i<n-2;i++){
        int p=i+1;
        int q=n-1;
       
        while(p<q){
            long sum =(long)(a[i].val+a[p].val+a[q].val);
        if(sum==t){
           ok =true;
            pw.print(a[i].idx+" "+a[p].idx+" "+(a[q].idx+1));
            break;
        }
        else if(sum<t){
            p++;

        }
        else{
            q--;
        }
        
       if(ok){
        break;}
       }
    }
    if(!ok){
    pw.print(-1);
    }
     pw.close();


}}