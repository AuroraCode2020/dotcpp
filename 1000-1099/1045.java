import java.io.*;
import java.util.Arrays;
import java.util.OptionalInt;

/**
 * 先使用 OptionalInt 找数组里最小数，再去遍历数组找所在的索引，最后交换。
 * 再找数组里最大数，再遍历数组找索引，最后交换。
 *
 * 注意：不能先找两个索引再去做两次交换！
 */

public class Main {
    public static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    public static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    public static StreamTokenizer cin = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
    public static PrintWriter cout = new PrintWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws Exception {
        int[] num = new int[10];
        for (int i = 0; i < 10; i++) {
            cin.nextToken();
            num[i] = (int) cin.nval;
        }
        OptionalInt min = Arrays.stream(num).min();
        OptionalInt max = Arrays.stream(num).max();
        int min1 = min.getAsInt(), max1 = max.getAsInt();
        for (int i = 0; i < 10; i++) {
            if (num[i] == min1) {
                min1 = i;
            }
        }
        int temp;
        temp = num[min1];
        num[min1] = num[0];
        num[0] = temp;
        for (int i = 0; i < 10; i++) {
            if (num[i] == max1) {
                max1 = i;
            }
        }
        temp = num[max1];
        num[max1] = num[9];
        num[9] = temp;
        for (int i : num) {
            cout.printf("%d ", i);
        }
        cout.flush();
    }
}
