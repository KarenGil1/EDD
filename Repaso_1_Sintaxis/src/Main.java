import java.util.Scanner;
public class Main {
    
    public static void main(String[] args){
        System.out.println("Captura la edad: ");
        Scanner input= new Scanner(System.in); 
        int iEdad = input.nextInt();
                System.out.println("Su edad es de "+iEdad+" años");
                if (iEdad>=18){
                    System.out.println("ES MAYOR DE EDAD");

                } else {
                    System.out.println("ES MENOR DE EDAD");

                    
                }
    }
}
