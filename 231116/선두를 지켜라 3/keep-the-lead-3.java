import java.util.*;
import java.io.*;

public class Main {
    public static int MAX_T = 1000000;
    public static int n,m;
    public static int[] A = new int[MAX_T+1];
    public static int[] B = new int[MAX_T+1];
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
                A[timeA] = A[timeA-1] + v;
                timeA++;
            }
        }

        int timeB = 1;
        for(int i = 0; i < m; i++){
            s = br.readLine().split(" ");
            int v = Integer.parseInt(s[0]);
            int t = Integer.parseInt(s[1]);

            while(t-- > 0){
                B[timeB] = B[timeB-1] + v;
                timeB++;
            }
        }

        int leader = 0 , rsuCnt = 0;
        for(int i = 1; i < timeA; i++){
            if(A[i] > B[i]){
                if(leader ==2 || leader ==3)
                    rsuCnt ++;

                leader = 1;
            }
            else if(A[i] < B[i]){
                if(leader == 1 || leader ==3)
                    rsuCnt ++;

                leader = 2;
            }
            else if(A[i] == B[i]){
                    rsuCnt ++;

                leader = 3;
            }
        }
        System.out.print(rsuCnt);
    }
}