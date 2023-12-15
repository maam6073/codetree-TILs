import java.util.*;
import java.io.*;

public class Main {
    private static int[] arr;
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < n; i++){
            int result = 0;
            int idx = i;
            for(int j = 0; j < n; j++){
                result += arr[idx] * j;

                if(idx < n-1)
                    idx ++;
                else
                    idx = 0;
            }
            min = Math.min(result,min);
        }
        System.out.print(min);
    }
}