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

        boolean check = true;
        for (String s : a) {
            if (s.equals("0")) {
                check = false;
                break;
            }
        }
        if(!check) {
            for (int i = 0; i < a.length; i++) {
                int result = 0;
                int cnt = 0;
                if (a[i].equals("0"))
                    a[i] = "1";

                for (int j = a.length - 1; j >= 0; j--) {
                    result += Integer.parseInt(a[j]) * Math.pow(2, cnt++);
                }
                max = Math.max(result, max);
                a[i] = b[i];
            }
        }
        else {
            for (int i = 0; i < a.length; i++) {
                int result = 0;
                int cnt = 0;
                if (a[i].equals("1"))
                    a[i] = "0";

                for (int j = a.length - 1; j >= 0; j--) {
                    result += Integer.parseInt(a[j]) * Math.pow(2, cnt++);
                }
                max = Math.max(result, max);
                a[i] = b[i];
            }
        }


        if(a.length <= 1)
            System.out.print(0);
        else
            System.out.print(max);
    }
}