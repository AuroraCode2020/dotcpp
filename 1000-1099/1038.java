import java.io.*;

public class Main {
    public static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    public static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    public static StreamTokenizer cin = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
    public static PrintWriter cout = new PrintWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws Exception {
        cin.nextToken();
        double a = cin.nval;
        cin.nextToken();
        double b = cin.nval;
        cin.nextToken();
        double c = cin.nval;
        double s = (a + b + c) / 2;
        double S = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        cout.printf("%.3f", S);
        cout.flush();
    }
}
