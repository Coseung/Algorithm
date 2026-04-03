import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[][] board = new char[5][15];
        for (char[] row : board) {
            Arrays.fill(row, ' ');
        }

        for (int i = 0; i < 5; i++) {
            String word = sc.nextLine();
            for (int j = 0; j < word.length(); j++) {
                board[i][j] = word.charAt(j);
            }
        }

        String result = "";
        for (int j = 0; j < 15; j++) {
            for (int i = 0; i < 5; i++) {
                if (board[i][j] != ' ') {
                    result += board[i][j];
                }
            }
        }

        System.out.println(result);
    }
}