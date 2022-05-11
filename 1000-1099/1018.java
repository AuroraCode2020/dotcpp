import java.io.*;

/**
 * 规律：第一项的分母是 1，分子是 2，往后分母是前一项的分子，分子是前一项的分子加上分母。
 */

public class Main {
    public static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    public static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    public static StreamTokenizer cin = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
    public static PrintWriter cout = new PrintWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws Exception {
        cin.nextToken();
        int n = (int) cin.nval;
        double sum = 0;
        double fenzi = 2, fenmu = 1;
        double a, b;
        for (int i = 1; i <= n; i++) {
            sum += fenzi / fenmu;
            a = fenzi;
            b = fenmu;
            fenzi = a + b;
            fenmu = a;
        }
        cout.printf("%.2f", sum);
        cout.flush();
    }
}