import java.io.*;

/**
 * 善用 System.arraycopy()
 */

public class Main {
    public static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    public static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    public static StreamTokenizer cin = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
    public static PrintWriter cout = new PrintWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws Exception {
        cin.nextToken();
        int n = (int) cin.nval;
        int[] num = new int[n];
        for (int i = 0; i < n; i++) {
            cin.nextToken();
            num[i] = (int) cin.nval;
        }
        cin.nextToken();
        int m = (int) cin.nval;
        int[] newNum = new int[n];
        System.arraycopy(num, n - m, newNum, 0, m);
        System.arraycopy(num, 0, newNum, m, n - m);
        for (int i : newNum) {
            cout.printf("%d ", i);
        }
        cout.flush();
    }
}
