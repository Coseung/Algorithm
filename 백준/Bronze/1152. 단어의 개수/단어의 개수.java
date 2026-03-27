import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        if (!sc.hasNextLine()) return;

        String word = sc.nextLine().trim();

        if (word.isEmpty()) {
            System.out.println(0);
        } else {
            int sum = 1;
            for (int i = 0; i < word.length(); i++) {
                if (word.charAt(i) == ' ') {
                    sum++;
                }
            }
            System.out.println(sum);
        }
    }
}