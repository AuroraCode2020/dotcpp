import java.io.*;
import java.util.Arrays;

/**
 * 数据保存在长度为 3 的数组里，然后用 Java Arrays 类提供的排序方法直接排就好了。
 */

public class Main {
    public static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    public static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    public static StreamTokenizer cin = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
    public static PrintWriter cout = new PrintWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws Exception {
        int[] t = new int[3];
        for (int i = 0; i < 3; i++) {
            cin.nextToken();
            t[i] = (int) cin.nval;
        }
        Arrays.sort(t);
        cout.println(t[2]);
        cout.flush();
    }
}