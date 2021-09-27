/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vane_
 */
import java.util.Scanner;
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    Scanner input = new Scanner(System.in);
    System.out.println("Introduce un numero: ");
    int iDia= input.nextInt();
 /*   if(iDia==1){
    System.out.println();
}else if (iDia==1){
    System.out.println();
}else if (iDia==1){
    System.out.println();
}else if (iDia==1){
    System.out.println();
    }*/
    switch(iDia){
        case 1:
            System.out.println("Domingo");
            break;
        case 2:
            System.out.println("Lunes");
            break;
        case 3:
            System.out.println("Martes");
            break;
        case 4:
            System.out.println("Miercoles");
            break;
        case 5:
            System.out.println("Jueves");
            break;
        case 6:
            System.out.println("Viernes");
            break;
        case 7:
            System.out.println("Sabado");
            break;
        default:
            System.out.println("Numero incorrecto");
            
    }
    }    
}