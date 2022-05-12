import java.io.*;

public class Main {
    public static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    public static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    public static StreamTokenizer cin = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
    public static PrintWriter cout = new PrintWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws Exception {
        String s1 = in.readLine();
        char[] c = s1.toCharArray();
        for (int i = 0; i < c.length; i++) {
            if (i == c.length - 1) {
                cout.print(c[i]);
            } else {
                cout.printf("%c ", c[i]);
            }
        }
        cout.flush();
    }
}
