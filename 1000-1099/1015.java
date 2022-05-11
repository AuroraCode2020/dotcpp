import java.io.*;

/**
 * 分别保存三个和，然后相加
 */

public class Main {
    public static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    public static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    public static StreamTokenizer cin = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
    public static PrintWriter cout = new PrintWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws Exception {
        cin.nextToken();
        double a;
        a = cin.nval;
        cin.nextToken();
        double b;
        b = cin.nval;
        cin.nextToken();
        double c;
        c = cin.nval;
        double sum1 = 0, sum2 = 0, sum3 = 0, sum;
        int i;
        for(i = 1; i <= a; i++){
            sum1 += i;
        }
        for(i = 1; i <= b; i++){
            sum2 += i * i;
        }
        for(i = 1; i <= c; i++){
            sum3 += 1 /(double) i;
        }
        sum = sum1 + sum2 + sum3;
        cout.printf("%.2f", sum);
        cout.flush();
    }
}