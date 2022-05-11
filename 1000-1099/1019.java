import java.io.*;

/**
 * 规律：
 * 高度 1000，第 5 次：
 * 1000 / 2 / 2 / 2 / 2 / 2 = 31.25
 * 1000 + 500 * 2 + 250 * 2 + 125 * 2 + 62.5 * 2 = 2875
 */

public class Main {
    public static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    public static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    public static StreamTokenizer cin = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
    public static PrintWriter cout = new PrintWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws Exception {
        double height;
        int n;
        cin.nextToken();
        height = cin.nval;
        cin.nextToken();
        n = (int) cin.nval;
        double l = 0;
        for (int i = n; i > 0; i--) {
            if (i != n) {
                l += height;
            }
            height /= 2;
            l += height * 2;
        }
        cout.printf("%.2f %.2f", height, l);
        cout.flush();
    }
}