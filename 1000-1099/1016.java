import java.io.*;

public class Main {
    public static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    public static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    public static StreamTokenizer cin = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
    public static PrintWriter cout = new PrintWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws Exception {
        int a, b, c;
        int temp;
        for (int i = 100; i < 1000; i++) {
            temp = i;
            c = temp % 10;
            temp /= 10;
            b = temp % 10;
            temp /= 10;
            a = temp % 10;
            if (Math.pow(a, 3) + Math.pow(b, 3) + Math.pow(c, 3) == i) {
                cout.println(i);
            }
        }
        cout.flush();
    }
}