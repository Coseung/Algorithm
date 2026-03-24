import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        double[] scores = new double[N];
        double max = 0;
        double sum = 0;
        for (int i = 0; i < N; i++) {
            scores[i] = sc.nextDouble();
            if (scores[i] > max) {
                max = scores[i];
            }
        }
        for (int j = 0; j < N; j++) {
            sum += (scores[j] / max) * 100;
        }
        System.out.println(sum / N);
    }
}