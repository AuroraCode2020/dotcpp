import java.io.*;

/**
 * Java 提供的 String 与 int 相互转换的方法解决这题十分方便
 */

public class Main {
    public static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    public static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    public static StreamTokenizer cin = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
    public static PrintWriter cout = new PrintWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws Exception {
        cin.nextToken();
        int n = (int) cin.nval;
        StringBuffer s = new StringBuffer("2");
        int sum = Integer.parseInt(s.toString());
        for (int i = 2; i <= n; i++) {
            s.append("2");
            sum += Integer.parseInt(s.toString());
        }
        cout.print(sum);
        cout.flush();
    }
}