import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] kg ={5,3};
        int count =0;
        while(true){
            if(N%kg[0]==0){
                count +=N/kg[0];
                break;
            }
            N -=kg[1];
            count++;
            if(N<0){
                count=-1;
                break;
            }
        }
        System.out.println(count);
    }
}