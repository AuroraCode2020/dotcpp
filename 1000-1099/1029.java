import java.io.*;

/**
 * 筛法求素数
 */

public class Main {
    public static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    public static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    public static StreamTokenizer cin = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
    public static PrintWriter cout = new PrintWriter(new OutputStreamWriter(System.out));

    static boolean[] primerNumber(int n){
        boolean[] f = new boolean[n + 1];
        f[0] = false;
        f[1] = false;
        for(int i = 2; i < n; i++){
            f[i] = true;
        }
        for(int i = 2; i <= n; i++){
            if(f[i] == true){
                for(int j = 2; j * i <= n; j++){
                    f[i * j] = false;
                }
            }
        }
        return f;
    }

    public static void main(String[] args) throws Exception {
        cin.nextToken();
        int n = (int) cin.nval;
        boolean[] f = primerNumber(n + 1);
        if (f[n] == true) {
            cout.print("prime");
        } else {
            cout.print("not prime");
        }
        cout.flush();
    }
}
