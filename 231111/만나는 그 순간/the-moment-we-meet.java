import java.util.*;
import java.io.*;

public class Main {
    private static int MAX_N = 1000000;
    private static int n;
    private static int m;
    private static int[] a = new int[MAX_N + 1];
    private static int[] b = new int[MAX_N + 1];
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        n = Integer.parseInt(s[0]);
        m = Integer.parseInt(s[1]);


        int timeA = 1;
        for(int i = 0; i < n; i++){
            s = br.readLine().split(" ");
            char d = s[0].charAt(0);
            int t = Integer.parseInt(s[1]);
            
            while(t-- > 0){
                if(d == 'R')
                    a[timeA] = a[timeA - 1] + 1;
                else
                    a[timeA] = a[timeA - 1] - 1;                        
                timeA++;
            }
        }

        int timeB = 1;
        for(int i = 0; i < m; i++){
            s = br.readLine().split(" ");
            char d = s[0].charAt(0);
            int t = Integer.parseInt(s[1]);

            while(t-- > 0){
                if(d == 'R')
                    b[timeB] = b[timeB-1] + 1;
                else
                    b[timeB] = b[timeB-1] - 1;
                timeB++;
            }
        }

        int result = -1;
        for(int i = 1; i < timeA; i++){
            if(a[i] == b[i]){
                result = i;
                break;
            }
        }

        System.out.print(result);
    }
}