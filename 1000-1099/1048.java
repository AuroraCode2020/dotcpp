import java.io.*;

/**
 * 直接用 String 类自带的 substring 方法，注意传进去的数是 m - 1。
 */

public class Main {
    public static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    public static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    public static StreamTokenizer cin = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
    public static PrintWriter cout = new PrintWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws Exception {
        cin.nextToken();
        int n = (int) cin.nval;
        cin.nextToken();
        String s = cin.sval;
        cin.nextToken();
        int m = (int) cin.nval;
        s = s.substring(m - 1);
        cout.print(s);
        cout.flush();
    }
}
