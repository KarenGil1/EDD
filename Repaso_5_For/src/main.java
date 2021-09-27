
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
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        int iCont = input.nextInt();
        
        for(int i = 0; i<= iCont; i++){
            System.out.print(i+" - ");
        }
        System.out.println("");
        for(int i = iCont; i >= 0; i--){
        System.out.print(i+" - ");

        }
    }
    
}
