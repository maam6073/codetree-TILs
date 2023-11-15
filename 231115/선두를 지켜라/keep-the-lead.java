import java.util.*;
import java.io.*;

public class Main {
    static final int MAX_N = 1000000;
    static int n;
    static int m;
    static int[] a = new int[MAX_N+1];
    static int[] b = new int[MAX_N+1];
    static int resultCnt = 0;
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        n = Integer.parseInt(s[0]);
        m = Integer.parseInt(s[1]);

        int timeA = 1 , timeB = 1 , MAX_V = 0;
        for(int i = 0; i < n+m; i++){
            s = br.readLine().split(" ");
            int v = Integer.parseInt(s[0]);
            int t = Integer.parseInt(s[1]);
            if(i % 2 == 0){
                while(t-- > 0){
                    a[timeA] += v;
                    timeA++;
                }
            }
            else{
                while(t-- > 0){
                    a[timeB] += v;
                    timeB++;
                }
            }
            int temp = MAX_V;
            MAX_V = Math.max(a[timeA],b[timeB]);
            if(temp != MAX_V){
                resultCnt++;
            }
        }

        System.out.print(resultCnt);
    }
}