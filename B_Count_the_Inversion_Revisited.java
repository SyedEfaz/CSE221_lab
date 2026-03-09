import java.io.*;
import java.util.*;

public class B_Count_the_Inversion_Revisited {

    static long count = 0;

    public static void mergeSort(int[] arr, int left, int right) {
        if (left >= right) return;

        int mid = (left + right) / 2;

        mergeSort(arr, left, mid);
        mergeSort(arr, mid + 1, right);

        countPairs(arr, left, mid, right);
        merge(arr, left, mid, right);
    }

   public static void countPairs(int[] arr, int left, int mid, int right) {

    long[] squares = new long[right - mid];

    for (int i = mid + 1; i <= right; i++) {
        squares[i - (mid + 1)] = (long) arr[i] * arr[i];
    }

    Arrays.sort(squares);

    int j = 0;

    for (int i = left; i <= mid; i++) {
        while (j < squares.length && (long) arr[i] > squares[j]) {
            j++;
        }
        count += j;
    }
}


    public static void merge(int[] arr, int left, int mid, int right) {

        int[] temp = new int[right - left + 1];

        int i = left;
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j <= right) {
            if (arr[i] <= arr[j])
                temp[k++] = arr[i++];
            else
                temp[k++] = arr[j++];
        }

        while (i <= mid)
            temp[k++] = arr[i++];

        while (j <= right)
            temp[k++] = arr[j++];

        for (int p = 0; p < temp.length; p++)
            arr[left + p] = temp[p];
    }

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = Integer.parseInt(st.nextToken());

        mergeSort(arr, 0, n - 1);

        pw.println(count);
        pw.flush();
        pw.close();
    }
}
