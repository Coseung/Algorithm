import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        sc.nextLine();
        String S = sc.nextLine();
        int sum =0;
        if(S.length() <=i){
            for(int j=0; j<i; j++){
                sum +=  S.charAt(j)-'0';
            }
        }
        System.out.println(sum);
    }
}
