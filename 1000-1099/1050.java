import java.io.*;

/**
 * 注意不能前面用 cin.nextToken() 后面用 in.readline()，用 in.readline() 必须从头用到尾，否则会阻塞输入。
 * Java 中的类实际就是 C++ 里的结构体。
 * 通过重写 toString 可以方便输出对象。
 */

public class Main {
    public static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    public static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    public static StreamTokenizer cin = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
    public static PrintWriter cout = new PrintWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws Exception {
        class student {
            String[] s;
            public student() {
                s = new String[5];
            }
            @Override
            public String toString() {
                return s[0] + ',' + s[1] + ',' + s[2] + ',' + s[3] + ',' + s[4];
            }
        }
        int n = Integer.parseInt(in.readLine());
        student[] a = new student[n];
        for (int i = 0; i < n; i++) {
            a[i] = new student();
        }
        for (int i = 0; i < n; i++) {
            String s = in.readLine();
            a[i].s = s.split(" ");
        }
        for (student i : a) {
            cout.println(i);
        }
        cout.flush();
    }
}
