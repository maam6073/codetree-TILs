import java.util.*;
import java.io.*;

public class Main {
    private static int[] arr;
    private static int[] cntArr;
    private static int idx = 0;
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        arr = new int[n];
        cntArr = new int[n];
        for(int i = 0; i < n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[i] = Integer.parseInt(st.nextToken());
        }
        
        for(int i = 0; i < arr.length; i++){
            //배열의 첫번째 인덱스에 증가를 하고
            //이어지는 수가 아닐경우 다음인덱스로
            cntArr[idx] ++;
            if(i != 0 && arr[i] != arr[i-1]){
                idx++;
            }
        }
        Arrays.sort(cntArr);
        System.out.print(cntArr[cntArr.length-1]);
    }
}