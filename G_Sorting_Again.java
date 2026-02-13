import java.util.*;
import java.io.*;
public class G_Sorting_Again{
    public static class student{
    int marks;
    int id;
    public student(int ID, int Marks){
     marks=Marks;
     id =ID;
    }


    }
public static void main(String args[]) throws IOException{
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
PrintWriter pw = new PrintWriter(System.out);

long t =Long.parseLong(br.readLine());
for(int i =0;i<t;i++){
    int n =Integer.parseInt(br.readLine());
   
   int[] id =new int[n];
   StringTokenizer sid =new StringTokenizer(br.readLine());
  for(int j =0;j<n;j++){
    id[j]=Integer.parseInt(sid.nextToken());
  }

   int[] marks =new int[n];
   StringTokenizer sm =new StringTokenizer(br.readLine());
   for(int m = 0;m<n;m++){
    marks[m] =Integer.parseInt(sm.nextToken());
   
   }
   student[] s = new student[n];
 for(int p =0;p<n;p++){
    s[p] =new student(id[p],marks[p]);


 }
 int minswaps=0;
 for(int p =0;p<n-1;p++){


    int idx =p;
    for(int j=p+1;j<n;j++){
        if(s[j].marks>s[idx].marks){
            idx=j;
        }
        else if(s[j].marks==s[idx].marks){
            if(s[j].id<s[idx].id){
                idx=j;

            }
        }

    }
if(idx!=p){student temp =s[p];
    s[p]=s[idx];
    s[idx]=temp;
    minswaps++;


 }


}

pw.println("Minimum swaps: "+minswaps);

for(int k=0;k<n;k++){
    pw.println("ID: "+s[k].id+" "+"Mark: "+s[k].marks);
}

}
pw.flush();

pw.close();}}









