import java.io.*;

public class Main {
    public static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    public static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    public static StreamTokenizer cin = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
    public static PrintWriter cout = new PrintWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws Exception {
        String s = in.readLine();
        char[] ch = s.toCharArray();
        int a = 0, b = 0, c = 0, d = 0;// Java 需要初始化
        for (int i = 0; i < ch.length; i++) {
            if ((ch[i] >= 'a' && ch[i] <= 'z') || (ch[i] >= 'A' && ch[i] <= 'Z')) {
                a++;
            } else if (ch[i] >= '0' && ch[i] <= '9') {
                b++;
            } else if (ch[i] == ' ') {
                c++;
            } else {
                d++;
            }
        }
        cout.printf("%d %d %d %d", a, b, c, d);
        cout.flush();
    }
}