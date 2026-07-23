import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class bufferReaderAndScanner {
    public static void main(String[] args) {
        System.out.println("please enter values");

//         InputStreamReader in =new InputStreamReader(System.in);
//         BufferedReader buff =new BufferedReader(in);
// int num =0;
//        try  {
//          num =Integer.parseInt(buff.readLine());  
//        } catch (IOException e) {
//         System.out.println(e);
//        }
//         System.out.println(num);  
        
        
Scanner sc = new Scanner(System.in);

int num =0;
num =sc.nextInt();

System.out.println(num);
        
    }
}
