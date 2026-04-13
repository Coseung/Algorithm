import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        List<Integer> plus = new ArrayList<>();
        List<Integer> minus = new ArrayList<>();
        int sum = 0;

        for (int i = 0; i < N; i++) {
            int num = sc.nextInt();
            if (num > 1) plus.add(num);
            else if (num == 1) sum += 1; 
            else minus.add(num); 
        }

        
        Collections.sort(plus, Collections.reverseOrder());
        Collections.sort(minus);

        Stack<Integer> st = new Stack<>();
        for (int p : plus) {
            if (st.isEmpty()) {
                st.push(p);
            } else {
                sum += (st.pop() * p);
            }
        }
        while (!st.isEmpty()) sum += st.pop(); 

        st.clear();
        for (int m : minus) {
            if (st.isEmpty()) {
                st.push(m);
            } else {
                sum += (st.pop() * m);
            }
        }
        while (!st.isEmpty()) sum += st.pop();

        System.out.println(sum);
    }
}