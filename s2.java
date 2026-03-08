import java.io.*;
import java.util.*;

public class s2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        int t = Integer.parseInt(br.readLine().trim());

        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());

            int[] A = new int[n];
            int[] B = new int[m];

            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) A[i] = Integer.parseInt(st.nextToken());

            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < m; i++) B[i] = Integer.parseInt(st.nextToken());

            int i = 0, j = m - 1;
            int bestI = 0, bestJ = 0;
            long bestDiff = Long.MAX_VALUE;

            while (i < n && j >= 0) {
                long sum = A[i] + B[j];
                long diff = Math.abs(sum - k);

                if (diff <= bestDiff) { // <= to always take the latest best pair
                    bestDiff = diff;
                    bestI = i;
                    bestJ = j;
                }

                if (sum > k) j--;
                else i++;
            }

            out.println((bestI + 1) + " " + (bestJ + 1));
        }

        out.flush();
    }
}
