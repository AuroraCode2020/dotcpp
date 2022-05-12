import java.io.*;

/**
 * 最小公约数：从两数中小的那个数开始找，直到找到一个可以同时被两数整除的数为止
 * 最小公倍数：两数相乘再除以最小公约数
 */

public class Main {
    public static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    public static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    public static StreamTokenizer cin = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
    public static PrintWriter cout = new PrintWriter(new OutputStreamWriter(System.out));

    static int gongyueshu(int a, int b) {
        int i;
        if (a > b) {
            i = b;
        } else {
            i = a;
        }
        for ( ;i > 0; i--) {
            if ((a / i == (double) a / i) && (b / i == (double) b / i)) {
                break;
            }
        }
        return i;
    }

    static int gongbeishu(int a, int b) {
        return a * b / gongyueshu(a, b);
    }

    public static void main(String[] args) throws Exception {
        int a, b;
        cin.nextToken();
        a = (int) cin.nval;
        cin.nextToken();
        b = (int) cin.nval;
        cout.printf("%d %d", gongyueshu(a, b), gongbeishu(a, b));
        cout.flush();
    }
}