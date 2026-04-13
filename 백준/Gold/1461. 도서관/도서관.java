import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        PriorityQueue<Integer> pluspq = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> miuspq = new PriorityQueue<>();
        int N = sc.nextInt();
        int M = sc.nextInt();
        sc.nextLine();
        int max =-99;
        for(int i=0; i<N; i++){
            int input = sc.nextInt();
            if(max < Math.abs(input)){
                max=Math.abs(input);
            }
            if(input >0){
                pluspq.add(input);
            }else {
                miuspq.add(input);
            }
        }
        int sum =0;
        while (!pluspq.isEmpty()){
            int k = pluspq.poll();
            sum += k*2;
            for (int i = 0; i < M - 1; i++) {
                if (!pluspq.isEmpty()) {
                    pluspq.poll();
                } else {
                    break;
                }
            }
        }
        while(!miuspq.isEmpty()){
            int k = miuspq.poll();
            sum += -1*k*2;
            for (int i = 0; i < M - 1; i++) {
                if (!miuspq.isEmpty()) {
                    miuspq.poll();
                } else {
                    break;
                }
            }
        }
        System.out.println(sum - max);
    }
}
