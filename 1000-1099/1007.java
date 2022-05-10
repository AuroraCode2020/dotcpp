import java.io.*;

public class Main {
    public static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    public static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    public static StreamTokenizer cin = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
    public static PrintWriter cout = new PrintWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws Exception {
        double x, y;
        cin.nextToken();
        x = cin.nval;
        if (x < 1) {
            y = x;
        } else if (x >= 1 && x < 10) {
            y = 2 * x - 1;
        } else {
            y = 3 * x - 11;
        }
        cout.printf("%.0f", y);// 这里注意不能用 cin.print() 或者 cin.println()，会默认带一位小数。
        cout.flush();
    }
}