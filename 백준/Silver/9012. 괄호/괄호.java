import java.util.*;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        sc.nextLine();
        for(int i=0; i<len; i++){
            boolean Noyes = true;
            String x= sc.next();
            Stack<Character> vps = new Stack<>();
            for(int j=0; j<x.length(); j++){
                if(x.charAt(j)=='('){
                    vps.push(x.charAt(j));
                } else if (x.charAt(j)==')' && !vps.isEmpty()) {
                    vps.pop();
                }else{
                    Noyes = false;
                }
            }
            if(!vps.isEmpty()){
                Noyes = false;
            }
            System.out.println(Noyes ? "YES" : "NO");
        }

    }
}