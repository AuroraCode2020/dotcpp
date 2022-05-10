import java.io.*;

/*
* 暴力解法，上限是 55，那我们直接开一个长度为 55 的数组把全部结果算出来，然后再根据要求输出第几年。
* */

public class Main {
    public static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    public static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    public static StreamTokenizer cin = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
    public static PrintWriter cout = new PrintWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws Exception {
        int n, i;
        int[] f = new int[55];
        for (i = 0; i < 4; i++) {
            f[i] = i;
        }
        for (i = 4; i < 55; i++) {
            f[i] = f[i - 1] + f[i - 3];
        }
        int index;
        while (true) {
            cin.nextToken();
            index = (int) cin.nval;
            if (index == 0) {
                break;
            } else {
                cout.println(f[index]);
            }
        }
        cout.flush();
    }
}