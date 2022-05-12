import java.io.*;
import java.util.Arrays;

public class Main {
    public static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    public static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    public static StreamTokenizer cin = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
    public static PrintWriter cout = new PrintWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws Exception {
        int[] num = new int[10];
        for (int i = 0; i < 10; i++) {
            cin.nextToken();
            num[i] = (int) cin.nval;
        }
        Arrays.sort(num);
        for (int i : num) {
            cout.println(i);
        }
        cout.flush();
    }
}