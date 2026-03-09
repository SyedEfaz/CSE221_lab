import java.io.*;
import java.util.*;

public class H_220_Trees_Reassessed {
    static int[] post;
    static Map<Integer, Integer> inIdx = new HashMap<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

        int n = Integer.parseInt(br.readLine().trim());
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) inIdx.put(Integer.parseInt(st.nextToken()), i);

        st = new StringTokenizer(br.readLine());
        post = new int[n];
        for (int i = 0; i < n; i++) post[i] = Integer.parseInt(st.nextToken());

        StringBuilder sb = new StringBuilder();
        Deque<int[]> stack = new ArrayDeque<>();
        stack.push(new int[]{0, n-1, 0, n-1});

        while (!stack.isEmpty()) {
            int[] c = stack.pop();
            if (c[0] > c[1]) continue;
            int root = post[c[3]], idx = inIdx.get(root), ls = idx - c[0];
            sb.append(root).append(' ');
            if (idx+1 <= c[1]) stack.push(new int[]{idx+1, c[1], c[2]+ls, c[3]-1});
            if (c[0] <= idx-1) stack.push(new int[]{c[0], idx-1, c[2], c[2]+ls-1});
        }

        pw.println(sb.toString().trim());
        pw.flush();
    }
}