import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for(int i=0; i<T; i++){
            int N = Integer.parseInt(br.readLine());
            int[][] list =new int[N][2];
            for(int j=0; j<N; j++){
                StringTokenizer st = new StringTokenizer(br.readLine(), " ");
                list[j][0] = Integer.parseInt(st.nextToken());
                list[j][1] = Integer.parseInt(st.nextToken());
            }
            Arrays.sort(list, new Comparator<int[]>() {
                @Override
                public int compare(int[] o1, int[] o2) {
                    if(o1[0] == o2[0]){
                        return o1[1] -o2[1];
                    }
                    return o1[0]-o2[0];
                }
            });
            int count=1;
            int temp =list[0][1];
            for(int k=1; k<N; k++){
                if(list[k][1]< temp){
                    count++;
                    temp =list[k][1];
                }
            }
            System.out.println(count);
        }
    }
}