import java.io.*;
import java.util.stream.Stream;

public class Main {

    private static boolean inRange(int i,int j){
        return (i+1) < j || (i-1) > j;
    }

    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] s = br.readLine().split(" ");
        int[] arr = Stream.of(s).mapToInt(Integer::parseInt).toArray();

        int max = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                int result = 0;
                if(inRange(i,j)){
                    result = arr[i] + arr[j];
                }
                max = Math.max(result,max);
            }
        }
        System.out.print(max);
    }
}