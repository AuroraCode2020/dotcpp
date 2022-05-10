import java.io.*;

public class Main {
    public static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    public static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    public static StreamTokenizer cin = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
    public static PrintWriter cout = new PrintWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws Exception {
        cin.nextToken();
        int x = (int) cin.nval;
        if (x >= 90) {
            cout.println("A");
        } else if (x >= 80 && x < 90) {
            cout.println("B");
        } else if (x >= 70 && x < 80) {
            cout.println("C");
        } else if (x >= 60 && x < 70) {
            cout.println("D");
        } else {
            cout.println("E");
        }
        cout.flush();
    }
}