import java.io.*;

/**
 * 注意每打一个数字就要打一个空格
 */

public class Main {
    public static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    public static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    public static StreamTokenizer cin = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
    public static PrintWriter cout = new PrintWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws Exception {
        cin.nextToken();
        double d = cin.nval;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j <= i; j++) {
                cout.printf("%6.2f ", d);
            }
            cout.println();
        }
        cout.flush();
    }
}
