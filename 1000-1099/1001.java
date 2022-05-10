import java.io.*;

/*
* Java 刷题最好都使用流，比普通的 Scanner 要快很多。
* 下面的四个流可以不求甚解地用。
*/

public class Main {
    public static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    public static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    public static StreamTokenizer cin = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
    public static PrintWriter cout = new PrintWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws Exception {
        cout.print("**************************\n" +
                "Hello World!\n" +
                "**************************");
        cout.flush();
    }
}