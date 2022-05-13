import java.io.*;
import java.util.Arrays;

/**
 * Arrays.sort() 也可以对 String 排序
 */

public class Main {
    public static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    public static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    public static StreamTokenizer cin = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
    public static PrintWriter cout = new PrintWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws Exception {
        String[] s = new String[3];
        for (int i = 0; i < 3; i++) {
            cin.nextToken();
            s[i] = cin.sval;
        }
        Arrays.sort(s);
        for (String str : s) {
            cout.println(str);
        }
        cout.flush();
    }
}
