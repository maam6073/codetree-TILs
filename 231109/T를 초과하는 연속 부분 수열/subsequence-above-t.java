import java.util.*;
import java.io.*;

public class Main {
    static final int MAX_N = 1000;
    static int[] arr = new int[MAX_N];
    static int n;
    static int t;
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        n = Integer.parseInt(s[0]);
        t = Integer.parseInt(s[1]);
        s = br.readLine().split(" ");
        for(int i = 0; i < s.length; i++){
            arr[i] = Integer.parseInt(s[i]);
        }
        Arrays.sort(arr);

        int ans = 0, cnt = 0;
        for(int i = 0; i < arr.length; i++){
            if((i >= 1 && arr[i-1] >= t) && arr[i] >= arr[i-1]){
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