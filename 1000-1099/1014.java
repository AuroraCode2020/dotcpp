import java.io.*;

/**
 * 写一个计算阶乘的方法，再循环求和
 * 踩坑：计算的结果有一个大数！用 long 来保存阶乘的结果！
 */

public class Main {
    public static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    public static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    public static StreamTokenizer cin = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
    public static PrintWriter cout = new PrintWriter(new OutputStreamWriter(System.out));

    static long jieCheng(int n) {
        long sum = 1;
        for (int i = 1; i <= n; i++) {
            sum *= i;
        }
        return sum;
    }

    public static void main(String[] args) throws Exception {
        cin.nextToken();
        int n = (int) cin.nval;
        long sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += jieCheng(i);
        }
        cout.print(sum);
        cout.flush();
    }
}