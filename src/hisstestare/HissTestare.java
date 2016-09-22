
package hisstestare;

import java.io.*;

public class HissTestare {

    public static void main(String[] args) throws IOException {
       
        BufferedReader input = new BufferedReader
                              (new InputStreamReader(System.in));
        
        Hiss h1 = new Hiss();
        Hiss h2 = new Hiss();

        while(true){    
            System.out.println("Du är på plan: " + h1.VilkenVåning()+ 
                ". Ange våning du vill åka till? tryck 77 för att gå av");
        try{ 
            String s = input.readLine();           
            int våning = Integer.parseInt(s);          
            h1.körTill(våning);    
            System.out.println(".\n.\n.\n.\n. ");
                  
                if(våning == 77){
                   h1.stanna();
                    break;
                }
           }catch(NumberFormatException e){
                System.out.println("FEL!!! Du måste skriva in ett heltal! ");
            }    
        }
    }
    
}
