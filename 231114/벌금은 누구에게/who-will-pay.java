import java.util.*;
import java.io.*;

public class Main {
    static int MAX_N = 100;
    static int n;
    static int m;
    static int k;
    static int[] student = new int[MAX_N+1];
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        n = Integer.parseInt(s[0]);
        m = Integer.parseInt(s[1]);
        k = Integer.parseInt(s[2]);
        

        for(int i = 0; i < m; i++){
            int ch = Integer.parseInt(br.readLine());
            student[ch] ++;
            if(student[ch] >= k) {
                System.out.print(ch);
                break;
            }
        }
    }
}