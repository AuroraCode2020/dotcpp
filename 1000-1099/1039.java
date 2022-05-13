import java.io.*;

/**
 * 如果可以被 400 整除，是闰年，如果不可以被 400 整除且可以被 100 整除，不是闰年，
 * 如果不可以被 400 整除且不可以被 100 整除，但是可以被 4 整除，是闰年，反之不是。
 */

public class Main {
    public static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    public static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    public static StreamTokenizer cin = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
    public static PrintWriter cout = new PrintWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws Exception {
        cin.nextToken();
        int a = (int) cin.nval;
        if (a % 400 == 0) {
            cout.print("L");
        } else{
            if (a % 100 == 0) {
                cout.print("N");
            } else {
                if (a % 4 == 0) {
                    cout.print("L");
                } else {
                    cout.print("N");
                }
            }
        }
        cout.flush();
    }
}
