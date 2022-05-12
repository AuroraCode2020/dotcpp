import java.io.*;
 
/**
 * 使用 StringBuilder 和它的 reverse() 方法
 */
 
public class Main {
    public static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    public static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    public static StreamTokenizer cin = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
    public static PrintWriter cout = new PrintWriter(new OutputStreamWriter(System.out));
 
    public static void main(String[] args) throws Exception {
        StringBuilder s = new StringBuilder(in.readLine());
        s.reverse();
        cout.print(s);
        cout.flush();
    }
}