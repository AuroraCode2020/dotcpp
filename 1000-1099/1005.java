import java.io.*;

/*
* 注意 cin.nval 的返回类型就是 double，不需要强制类型转换了。
* */

public class Main {
    public static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    public static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    public static StreamTokenizer cin = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
    public static PrintWriter cout = new PrintWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws Exception {
        cin.nextToken();
        double F = cin.nval;
        double C = 5 * (F - 32) / 9;
        cout.printf("c=%.2f", C);
        cout.flush();
    }
}