import java.io.*;

/**
 * a + b 直接打印，没啥好说的。
 */


public class Main {
    public static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    public static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    public static StreamTokenizer cin = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
    public static PrintWriter cout = new PrintWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws Exception {
        int a, b;
        while (cin.nextToken() != StreamTokenizer.TT_EOF) {// 注意这里检测输入结束的标志
            a = (int) cin.nval;
            cin.nextToken();
            b = (int) cin.nval;
            cout.println(a + b);
        }
        cout.flush();
    }
}