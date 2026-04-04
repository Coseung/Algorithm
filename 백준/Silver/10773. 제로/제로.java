import java.util.*;
public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int sum=0;
        for(int i=0; i<len; i++){
            int input = sc.nextInt();
            if( input != 0){
                stack.push(input);
            }else {
                stack.pop();
            }
        }
        while (!stack.isEmpty()){
            sum += stack.pop();
        }
        System.out.println(sum);
    }
}