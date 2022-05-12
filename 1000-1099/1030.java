import java.io.*;

/**
 * 用一个方法来转置对应矩阵元素
 */

public class Main {
    public static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    public static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    public static StreamTokenizer cin = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
    public static PrintWriter cout = new PrintWriter(new OutputStreamWriter(System.out));

    static void swap(int a, int b, int[] num) {
        int temp;
        temp = num[a];
        num[a] = num[b];
        num[b] = temp;
    }

    public static void main(String[] args) throws Exception {
        int[] num = new int[9];
        for (int i = 0; i < 9; i++) {
            cin.nextToken();
            num[i] = (int) cin.nval;
        }
        swap(1, 3, num);
        swap(2, 6, num);
        swap(5, 7, num);
        for (int i = 0; i < 9; i++) {
            if ((i + 1) % 3 == 0) {
                cout.println(num[i]);
            } else {
                cout.printf("%d ", num[i]);
            }
        }
        cout.flush();
    }
}
