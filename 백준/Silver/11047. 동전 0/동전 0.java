import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int[] list = new int[N];
        for (int i =N-1; i>=0; i--){
            list[i] = Integer.parseInt(br.readLine());
        }
        int count =0;
        for(int i=0; i<N; i++){
            if(K>0){
                if(list[i] <= K){
                    int temp = K/list[i];
                    K = K - (temp*list[i]);
                    count += temp;
                }
            }
        }
        System.out.println(count);
    }
}