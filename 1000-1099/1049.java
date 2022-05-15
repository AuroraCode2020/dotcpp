import java.io.*;

/**
 * 定义两个方法，一个判断这一年是不是闰年，另一个根据前面方法的结果返回天数。
 */

public class Main {
    public static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    public static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    public static StreamTokenizer cin = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
    public static PrintWriter cout = new PrintWriter(new OutputStreamWriter(System.out));

    static boolean judgeYear(int year) {
        if(year%400==0){
            return true;
        }
        else{
            if(year%100==0){
                return false;
            }
            else{
                if(year%4==0){
                    return true;
                }
                else{
                    return false;
                }
            }
        }
    }

    static int judgeDay(int year, int month, int day){
        int[] a = new int[]{31,29,31,30,31,30,31,31,30,31,30};
        int[] b = new int[]{31,28,31,30,31,30,31,31,30,31,30};
        int result = 0;
        if(judgeYear(year)){
            for(int i=0;i<month;i++){
                if(i+1==month){
                    result = result + day;
                }
                else{
                    result = result + a[i];
                }
            }
        }
        else{
            for(int i=0;i<month;i++){
                if(i+1==month){
                    result = result + day;
                }
                else{
                    result = result + b[i];
                }
            }
        }
        return result;
    }

    public static void main(String[] args) throws Exception {
        int year, month, day;
        cin.nextToken();
        year = (int) cin.nval;
        cin.nextToken();
        month = (int) cin.nval;
        cin.nextToken();
        day = (int) cin.nval;
        cout.print(judgeDay(year, month, day));
        cout.flush();
    }
}
