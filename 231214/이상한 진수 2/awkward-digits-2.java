import java.util.*;
import java.io.*;

public class Main {
    private static String[] b;
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] a = br.readLine().split("");
        b = a.clone();
        int max = 0;

        for(int i = 0; i < a.length; i++){
            int result = 0;
            int cnt = 0;
            if(a[i].equals("0"))
                a[i] = "1";

            for(int j = a.length-1; j >= 0; j--){
                result += Integer.parseInt(a[j]) * Math.pow(2,cnt++);
            }
            max = Math.max(result,max);
            a[i] = b[i];
        }

        System.out.print(max);
    }
}