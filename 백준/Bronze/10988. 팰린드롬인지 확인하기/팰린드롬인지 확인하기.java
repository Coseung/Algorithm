import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String pal = sc.nextLine();
        int len = pal.length();
        int result =1;
        for(int i =0; i<len/2; i++){
            if(pal.charAt(i) != pal.charAt(len-i-1)){
                result=0;
                break;
            }
        }
        System.out.println(result);


    }
  }
