import java.io.*;
import java.util.*;

public class BSTOrdering {
    
    static int n;
    static int[] arr;
    static Map<String, Integer> memo;
    static List<Integer> result;
    
    /**
     * Find the minimum height when inserting elements from index l to r
     * Returns the height of the resulting tree
     */
    static int minHeight(int l, int r) {
        if (l > r) return 0;
        if (l == r) return 1;
        
        String key = l + "," + r;
        if (memo.containsKey(key)) {
            return memo.get(key);
        }
        
        int minH = Integer.MAX_VALUE;
        
        // Try each element as root
        for (int root = l; root <= r; root++) {
            int leftHeight = minHeight(l, root - 1);
            int rightHeight = minHeight(root + 1, r);
            // Height of tree = 1 + max(left height, right height)
            int height = 1 + Math.max(leftHeight, rightHeight);
            minH = Math.min(minH, height);
        }
        
        memo.put(key, minH);
        return minH;
    }
    
    /**
     * Build the ordering that minimizes height
     */
    static void buildOrder(int l, int r, int targetHeight) {
        if (l > r) return;
        if (l == r) {
            result.add(arr[l]);
            return;
        }
        
        // Find root that achieves target height
        for (int root = l; root <= r; root++) {
            int leftHeight = minHeight(l, root - 1);
            int rightHeight = minHeight(root + 1, r);
            int height = 1 + Math.max(leftHeight, rightHeight);
            
            if (height == targetHeight) {
                result.add(arr[root]);
                buildOrder(l, root - 1, leftHeight);
                buildOrder(root + 1, r, rightHeight);
                return;
            }
        }
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new BufferedOutputStream(System.out));
        
        n = Integer.parseInt(br.readLine());
        arr = new int[n];
        memo = new HashMap<>();
        result = new ArrayList<>();
        
        String[] tokens = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(tokens[i]);
        }
        
        int minH = minHeight(0, n - 1);
        buildOrder(0, n - 1, minH);
        
        for (int i = 0; i < result.size(); i++) {
            if (i > 0) pw.print(" ");
            pw.print(result.get(i));
        }
        pw.println();
        
        pw.flush();
        pw.close();
        br.close();
    }
}