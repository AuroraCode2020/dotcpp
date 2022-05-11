import java.io.*;

/**
 * 从第 N 天剩下一个桃子时退回第一天
 */

public class Main {
    public static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    public static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    public static StreamTokenizer cin = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
    public static PrintWriter cout = new PrintWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws Exception {
        cin.nextToken();
        int n = (int) cin.nval;
        int sum = 1;
        for (int i = n - 1; i > 0; i--) {
            sum = (sum + 1) * 2;
        }
        cout.print(sum);
        cout.flush();
    }
}