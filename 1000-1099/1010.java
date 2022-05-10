import java.io.*;

/**
 * 一道 if 的简单题
 */

public class Main {
    public static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    public static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    public static StreamTokenizer cin = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
    public static PrintWriter cout = new PrintWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws Exception {
        cin.nextToken();
        double i = cin.nval;
        if (i <= 100000) {//①    利润低于或等于100000元时
            i = i * 0.1;
        } else if (100000 < i && i <= 200000) {//②    利润高于100000元，低于200000元时
            i = (100000 * 0.1) + (i - 100000) * 0.075;
        } else if (200000 < i && i <= 400000) {//③    200000<i≤400000时
            i = (100000 * 0.1) + 100000 * 0.075 + (i - 200000) * 0.05;
        } else if (400000 < i && i <= 600000) {//④    400000<i≤600000元时
            i = (100000 * 0.1) + 100000 * 0.075 + 200000 * 0.05 + (i - 400000) * 0.03;
        } else if (600000 < i && i <= 1000000) {//⑤    600000<i≤1000000时
            i = (100000 * 0.1) + 100000 * 0.075 + 200000 * 0.05 + 200000 * 0.03 + (i - 600000) * 0.015;
        } else {//⑥    i>1000000时
            i = (100000 * 0.1) + 100000 * 0.075 + 200000 * 0.05 + 200000 * 0.03 + 400000 * 0.015 + (i - 1000000) * 0.01;
        }
        cout.printf("%.0f", i);
        cout.flush();
    }
}