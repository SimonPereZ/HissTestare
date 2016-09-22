/*
 * Klassnamnet är Hiss
 * Riktning och våning är instansvariabler av typen int.
 * Riktning är antingen -1 (hissen går neråt), 0 (hissen står stilla) 
 * eller 1 (hissen går uppåt).
 * Begränsa antal våningar från -2 till max 10 våningar.
 * KörTill, Stanna och VilkenVåning är instansmetoder7
 * Exempel på användning av metoderna:
 * KörTill(5) visar meddelandet: ”Hissen går upp till plan 5” om hissen befinner 
 * sig på plan -2 till
 * 4, och ”Hissen går ner till plan 5” om hissen befinner sig på ett övre plan.
 * Anrop av metoden Stanna() visar meddelandet: ”Hissen står sill och befinner sig på plan 5”.
 * Metoden VilkenVåning() returnerar ett heltal med våningsnumret.
 * Skapa även ett testprogram (som innehåller main).
 * I programmet ska du skapa två olika objekt av klassen Hiss.
 * Testa alla metoder.
 */
package hisstestare;

/**
 *
 * @author PereZ
 */
public class Hiss {
  //Instansvariabler
    private int riktning;
    private int våning;
    
 //INSTANS METODER
    public void körTill(int Indata){
        
      if(Indata < -2 || Indata > 10 ){ 
          System.out.println("Den våningen finns inte! välj mellan Våning -2 till 10");
      }
      else{
        if (Indata>våning){ 
            this.riktning = 1;
            System.out.println("Hissen går upp till plan: " + Indata);
            våning = Indata;
        }
        else if (Indata<våning){             
            this.riktning = -1;
            System.out.println("Hissen går ner till plan: " + Indata);
            våning = Indata;
        }
        else{
            this.riktning = 0;
            System.out.println("Du är redan på plan: " + Indata+"!");
            våning = Indata;
        }
      }       
    }
    
    public void stanna(){
        System.out.println("Hissen står sill och befinner sig på plan "+ 
                           våning + " Välkommen åter!");
    }
    
    public int VilkenVåning(){
        
        return våning;
    }
}
