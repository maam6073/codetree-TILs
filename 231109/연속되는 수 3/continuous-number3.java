import java.util.*;
import java.io.*;

public class Main {
    private static final int MAX_N = 1000;
    private static int[] arr = new int[MAX_N];
    private static int n;

    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        for(int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }


        int ans = 0, cnt = 0;
        for(int i = 0; i < n; i++){
            if(i >= 1 && arr[i] * arr[i-1] > 0){
                cnt++;
            }
            else{
                cnt = 1;
            }
            ans = Math.max(ans,cnt);
        }
        System.out.print(ans);
    }
}