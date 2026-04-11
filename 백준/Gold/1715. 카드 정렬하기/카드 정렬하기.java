import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        PriorityQueue<Long> pq = new PriorityQueue<>();

        for(int i=0; i<N; i++){
             pq.add(Long.parseLong(br.readLine()));
        }
        long totalSum =0;
        while (pq.size()>1){
            long first = pq.poll();
            long second =pq.poll();

            long sum =first+second;
            totalSum += sum;

            pq.add(sum);
        }
        System.out.println(totalSum);
    }
}