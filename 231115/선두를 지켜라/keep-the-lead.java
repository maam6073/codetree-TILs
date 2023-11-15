import java.util.*;
import java.io.*;

public class Main {
    static final int MAX_N = 1000000;
    static int n;
    static int m;
    static int[] a = new int[MAX_N+1];
    static int[] b = new int[MAX_N+1];
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        n = Integer.parseInt(s[0]);
        m = Integer.parseInt(s[1]);

        int timeA = 1;
        for(int i = 0; i < n; i++){
            s = br.readLine().split(" ");
            int v = Integer.parseInt(s[0]);
            int t = Integer.parseInt(s[1]);
            while(t-- > 0){
                a[timeA] += v;
                timeA++;
            }
        }

        int timeB = 1;
        for(int i = 0; i < m; i++){
            s = br.readLine().split(" ");
            int v = Integer.parseInt(s[0]);
            int t = Integer.parseInt(s[1]);
            while(t-- > 0){
                b[timeB] += v;
                timeB++;
            }
        }
        

        int leader = 0, ans = 0;
        for(int i = 1; i < timeA; i++){
            if(a[i] > b[i]){
                if(leader == 2){
                    ans ++;
                }

                leader = 1;
            }
            else if(a[i] < b[i]){
                if(leader == 1)
                    ans++;

                leader = 2;
            }
        }

        System.out.print(ans);
    }
}