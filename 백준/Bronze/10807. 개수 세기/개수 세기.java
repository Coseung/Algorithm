import java.util.Scanner;
public class Main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] list = new int[n];
        int i;
        for ( i=0; i<n; i++){
            list[i] = sc.nextInt();
        }
        int count = sc.nextInt();
        int j;
        int a=0;
        for (j =0 ; j<n; j++){
          if(list[j]==count) {
              a++;
          }
        }
        System.out.println(a);
    }
}