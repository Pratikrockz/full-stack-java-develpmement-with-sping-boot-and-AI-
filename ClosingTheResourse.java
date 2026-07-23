import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ClosingTheResourse {
    public static void main(String[] args) throws IOException {



int num =0;  

// here try is automatically close the resourse 
        try (BufferedReader buf= new BufferedReader( new InputStreamReader(System.in))) {
           
        
             num =Integer.parseInt(buf.readLine()) ;
        } 
        catch(Exception e){
            System.out.println(e);
        }
        // final{
        //     buf.close()
        // }

        System.out.println(num);
    }
}
