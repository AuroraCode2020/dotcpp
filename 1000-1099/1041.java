import java.io.*;
import java.util.Arrays;

public class Main {
    public static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    public static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    public static StreamTokenizer cin = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
    public static PrintWriter cout = new PrintWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws Exception {
        double[] num = new double[3];
        for (int i = 0; i < 3; i++) {
            cin.nextToken();
            num[i] = cin.nval;
        }
        Arrays.sort(num);
        cout.printf("%.3f\n", num[2]);
        cout.printf("%.3f", num[2]);
        cout.flush();
    }
}
