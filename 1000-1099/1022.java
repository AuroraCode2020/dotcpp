import java.io.*;

/**
 * 筛法求素数
 */

public class Main {
    public static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    public static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    public static StreamTokenizer cin = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
    public static PrintWriter cout = new PrintWriter(new OutputStreamWriter(System.out));

    static boolean[] judgeNumber(int n) {
        boolean[] f = new boolean[n + 1];
        f[1] = false;
        for (int i = 2; i < n; i++) { // 把从 2 开始的数全部初始化
            f[i] = true;
        }
        f[0] = false; // 0 无意义，置为 false
        for (int i = 2; i <= n; i++) { // 质数的倍数（1 倍数除外）必然是合数
            if (f[i] == true) {
                for (int j = 2; j * i <= n; j++) {
                    f[i * j] = false;
                }
            }
        }
        return f;
    }

    public static void main(String[] args) throws Exception {
        cin.nextToken();
        int n = (int) cin.nval;
        boolean[] b = judgeNumber(n);
        for (int i = 0; i < b.length; i++) {
            if (b[i] == true) {
                cout.println(i);
            }
        }
        cout.flush();
    }
}