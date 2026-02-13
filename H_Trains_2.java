
import java.io.*;
import java.util.*;

public class H_Trains_2 {
    
    public static class trains{
      long depature;
      String destination;
      String name;
      int idx;
      public trains(String name,String destination,long departure,int idx){
        this.name=name;
        this.destination = destination;
        this.depature= departure;
        this.idx=idx;
      }



    }
    public static long inmin (String time){
      String[] parts = time.split(":");
      int hours = Integer.parseInt(parts[0]);
      int minutes = Integer.parseInt(parts[1]);
    
      return hours * 60 + minutes ;
    }
    public static int rank( char c){
      if(c>='a'&&c<='z'){return c-'a';}
      return 26+c-'A';

    }
    public static int compare(String a, String b ){
      int n =Math.min(a.length(),b.length());
      for(int i =0;i<n;i++){
      int ra =rank(a.charAt(i));
      int rb =rank(b.charAt(i));
      if(ra!=rb){return ra-rb;}
      }
      return a.length()-b.length();

    }
   public static void main(String args[])throws IOException{
    BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
 PrintWriter pw =new PrintWriter(System.out);
 int t = Integer.parseInt(br.readLine());
 trains[] train = new trains[t];
 for(int i =0;i<t;i++){
StringTokenizer st =new StringTokenizer(br.readLine());
String name =st.nextToken();
st.nextToken();
st.nextToken();
st.nextToken();
String destination =st.nextToken();
st.nextToken();
Long departure = inmin(st.nextToken());
train [i]=new trains(name, destination, departure,i);

 }
 Arrays.sort(train,(a,b)->{
int c = compare(a.name,b.name);
if(c!=0){return c;}
if(a.depature!=b.depature){return Long.compare(b.depature,a.depature);}
 return a.idx-b.idx;



 });

for(trains tr: train){
long h =tr.depature/60;
long m =tr.depature%60;
pw.printf("%s will depart for %s at %02d:%02d\n",tr.name,tr.destination,h,m);


}
pw.flush();








 
   }
}
