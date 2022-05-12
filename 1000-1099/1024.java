import java.io.*;

/**
 * 主对角线元素行坐标等于列坐标，副对角线元素行坐标加列坐标等于阶数减一。
 */

public class Main {
    public static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    public static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    public static StreamTokenizer cin = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
    public static PrintWriter cout = new PrintWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws Exception {
        cin.nextToken();
        int a = (int) cin.nval;
        cin.nextToken();
        int b = (int) cin.nval;
        cout.print(a + b);
        cout.flush();
    }
}