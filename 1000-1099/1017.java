import java.io.*;
import java.util.ArrayList;

public class Main {
    public static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    public static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    public static StreamTokenizer cin = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
    public static PrintWriter cout = new PrintWriter(new OutputStreamWriter(System.out));

    static void PerfectNumber(int n) {
        ArrayList<Integer> yinshu = new ArrayList(); // 因子保存在一个 ArrayList 里。（普通的数组长度是固定的）
        int sum = 0;
        for (int i = 1; i <= n / 2; i++) { // 判断因子的方法：从 1 一直循环到 n / 2，如果可以整除就是因子
            if (n / i == (double) n / (double) i) {
                yinshu.add(i);
            }
        }
        for (int i : yinshu) {
            sum += i;
        }
        if (sum == n) {
            cout.printf("%d its factors are ", n);
            for (int i = 0; i < yinshu.size(); i++) {
                if (i == yinshu.size() - 1) {
                    cout.printf("%d\n", yinshu.get(i));
                } else {
                    cout.printf("%d ", yinshu.get(i));
                }
            }
        }
    }

    public static void main(String[] args) throws Exception {
        cin.nextToken();
        int n = (int) cin.nval;
        for (int i = 1; i <= n; i++) {
            PerfectNumber(i);
        }
        cout.flush();
    }
}