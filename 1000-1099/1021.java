import java.io.*;

public class Main {
    public static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    public static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    public static StreamTokenizer cin = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
    public static PrintWriter cout = new PrintWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws Exception {
        double x, b, c;
        cin.nextToken();
        x = cin.nval;
        b = x / 2;
        while (true) {
            c = (b + x / b) / 2;
            if (Math.abs(c - b) < 0.00001) {
                break;
            }
            b = c;
        }
        cout.printf("%.3f", c);
        cout.flush();
    }
}