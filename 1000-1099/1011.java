import java.io.*;

/**
 * 找公因数：从小的那个数开始往下遍历，当两个数都可以把它整除时就是公因数。
 * 找公倍数：两个数相乘再除以公因数就是公倍数。
 */

public class Main {
    public static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    public static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    public static StreamTokenizer cin = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
    public static PrintWriter cout = new PrintWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws Exception {
        int a, b;
        cin.nextToken();
        a = (int) cin.nval;
        cin.nextToken();
        b = (int) cin.nval;
        int i = 0;
        int yue = 0, bei = 0;
        if (a > b) {
            i = b;
        } else {
            i = a;
        }
        for ( ; i > 0; i--) {
            if ((double) a / (double) i == a / i && (double) b / (double) i == b / i) {
                yue = i;
                break;
            }
        }
        bei = a * b / yue;
        cout.printf("%d %d", yue, bei);
        cout.flush();
    }
}