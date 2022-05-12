import java.io.*;

/**
 * String 使用 toCharArray() 方法转换成 char[]
 */

public class Main {
    public static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    public static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    public static StreamTokenizer cin = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
    public static PrintWriter cout = new PrintWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws Exception {
        String s1 = in.readLine();
        char[] c = s1.toCharArray();
        for (char t : c) {
            if (t == 'a' || t == 'e' || t == 'i' || t == 'o' || t == 'u') {
                cout.print(t);
            }
        }
        cout.flush();
    }
}
