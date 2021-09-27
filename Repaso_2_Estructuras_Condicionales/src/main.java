import java.util.Scanner;
public class main {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*scanner=clase
        input= objeto/variable/identificador
        new=palabra reservada/ para instanciar
        System.in=constructor de clase Scanner*/
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce el genero (Hoombre-->H, Mujer-->M)");
        String sGen = input.nextLine();
        System.out.println("introduce tu edad");
        int iEdad = input.nextInt();

        
        if(sGen.equals("M")){//mujer
           if (iEdad>=60){
               System.out.println("Si se puede jubilar");
           } else{//hombre
               System.out.println("No se puede jubilar");
               
           }
        }else if(sGen.equals("H")){
            if (iEdad>=65){
               System.out.println("Si se puede jubilar");
           } else{
               System.out.println("No se puede jubilar");
               
           }
            
        }else{
              System.out.println("Debes introducir una M o una H");

        }
    }
    
}
