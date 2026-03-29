import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] chess= {1,1,2,2,2,8};
        int[] input = new int[6];

        for(int i=0; i<6; i++){
            input[i] = chess[i] - sc.nextInt();
        }
        for(int j=0; j<6; j++){
            System.out.print(input[j]+ " ");
        }


    }
}