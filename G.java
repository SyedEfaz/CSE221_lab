import java.io.*;
import java.util.*;

public class G {
    static int[] preorder;
    static int[] result;
    static int preIndex = 0;
    static int resultIndex = 0;
    static Map<Integer, Integer> inIndex = new HashMap<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

        int n = Integer.parseInt(br.readLine().trim());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] inorder = new int[n];
        for (int i = 0; i < n; i++) {
            inorder[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        preorder = new int[n];
        for (int i = 0; i < n; i++) {
            preorder[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < n; i++) {
            inIndex.put(inorder[i], i);
        }

        result = new int[n];
        makePostorder(0, n - 1);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            if (i > 0) sb.append(' ');
            sb.append(result[i]);
        }
        pw.print(sb);
        pw.flush();
    }

    static void makePostorder(int l, int r) {
        if (l > r) return;
        int root = preorder[preIndex++];
        int idx = inIndex.get(root);
        makePostorder(l, idx - 1);
        makePostorder(idx + 1, r);
        result[resultIndex++] = root;
    }
}
