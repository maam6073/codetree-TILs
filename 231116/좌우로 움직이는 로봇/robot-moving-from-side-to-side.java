import java.util.*;
import java.io.*;

public class Main {
    public static int MAX_N = 50000;
    public static int n,m;
    public static int[] A = new int[MAX_N+1];
    public static int[] B = new int[MAX_N+1];
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        int timeA = 1;
        for(int i = 0; i < n; i++){
            st = new StringTokenizer(br.readLine());
            int t = Integer.parseInt(st.nextToken());
            char d = st.nextToken().charAt(0);

            while(t-- > 0){
                if(d == 'R')
                    A[timeA] = A[timeA-1] + 1;
                else
                    A[timeA] = A[timeA-1] - 1;
            }
        }

        int timeB = 1;
        for(int i = 0; i < m; i++){
            st = new StringTokenizer(br.readLine());
            int t = Integer.parseInt(st.nextToken());
            char d = st.nextToken().charAt(0);

            while(t-- > 0){
                if(d == 'R')
                    B[timeB] = B[timeB-1] + 1;
                else
                    B[timeB] = B[timeB-1] - 1;
            }
        }
        int result = 0;
        for(int i = 0; i < n; i++){
            if(A[i] == B[i])
                result ++;
        }

        System.out.print(result);
    }
}