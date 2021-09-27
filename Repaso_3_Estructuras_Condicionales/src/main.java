
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vane_
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce el genero (Hoombre-->H, Mujer-->M)");
        String sGen = input.nextLine();
        System.out.println("introduce tu edad");
        int iEdad = input.nextInt();
        
        if((sGen.equals("M"))&& (iEdad>=60)){
            System.out.println("Si se puede jubilar");
        }else if((sGen.equals("H"))&& (iEdad>=65)){
               System.out.println("Si se puede jubilar");
        }else if((!sGen.equals("M"))&&(!sGen.equals("H"))) {       
               System.out.println("LETRA INCORRECTA");  
        }else{
            System.out.println("No te puedes jubilar");
        }         
    }  
}
