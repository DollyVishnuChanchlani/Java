import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
class TryWithResourcesEx{
    public static void main(String args[]){
        try(BufferedReader br = new BufferedReader
        (new InputStreamReader(System.in))){ //It will close BufferedReader. No need to close explicitly
            System.out.println("Enter a number");
            int num = Integer.parseInt(br.readLine());
            System.out.println("num="+num);
        }catch(IOException | NumberFormatException e){
            e.printStackTrace();
        }
        
    }
}