import java.io.*;

/**
 * 读进来数字，再转换成 String、StringBuffer（可以反转）、char[]（每位数字）
 */

public class Main {
    public static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    public static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    public static StreamTokenizer cin = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
    public static PrintWriter cout = new PrintWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws Exception {
        cin.nextToken();
        int n = (int) cin.nval;
        String s = Integer.toString(n);
        StringBuffer str = new StringBuffer(s);
        char[] c = s.toCharArray();
        cout.println(s.length());
        for (int i = 0; i < c.length; i++) {
            if (i != c.length - 1) {
                cout.print(c[i] + " ");
            } else {
                cout.println(c[i]);
            }
        }
        cout.print(str.reverse());
        cout.flush();
    }
}