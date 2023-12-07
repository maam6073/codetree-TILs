import java.util.*;
import java.io.*;

public class Main {
    private static int[] arr;
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        arr = new int[n];
        String[] s = br.readLine().split(" ");
        for(int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(s[i]);
        }
        int resultMin = Integer.MAX_VALUE;

        for(int i = 0; i < n; i++){
            int m = 0;
            for(int j = 0; j < n; j++){
                m += arr[j] * (Math.abs(i - j));
            }
            resultMin = Math.min(m,resultMin);
        }
        System.out.print(resultMin);
    }
}