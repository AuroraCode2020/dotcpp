import java.io.*;

/**
 * 要注意判别式小于零时候的情况
 */

public class Main {
    public static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    public static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    public static StreamTokenizer cin = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
    public static PrintWriter cout = new PrintWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws Exception {
        double a, b, c;
        double x1, x2;
        double z;

        cin.nextToken();
        a = cin.nval;
        cin.nextToken();
        b = cin.nval;
        cin.nextToken();
        c = cin.nval;

        z = b * b - 4 * a * c;
        if (z > 0) {
            x1 = (-b + Math.sqrt(z)) / (2 * a);
            x2 = (-b - Math.sqrt(z)) / (2 * a);
            cout.printf("x1=%.3f x2=%.3f\n", x1, x2);
        } else if (z < 0) {
            z = Math.sqrt(-z);
            cout.printf("x1=%.3f+%.3fi x2=%.3f-%.3fi\n", -b /(2 * a), z /(2 * a), -b /(2 * a), z /(2 * a));
        } else {
            x1 = x2 = (-b) / (2 * a);
            cout.printf("x1=%.3f x2=%.3f\n", x1, x2);
        }
        cout.flush();
    }
}