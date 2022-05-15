import java.io.*;

/**
 * 公式法直接解决。
 */

public class Main {
    public static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    public static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    public static StreamTokenizer cin = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
    public static PrintWriter cout = new PrintWriter(new OutputStreamWriter(System.out));

    static int f(int n){
        if(n==1){
            return 0;
        }
        else{
            return (f(n-1)+3)%n;
        }
    }

    public static void main(String[] args) throws Exception {
        cin.nextToken();
        int n = (int) cin.nval;
        cout.print(f(n) + 1);
        cout.flush();
    }
}
