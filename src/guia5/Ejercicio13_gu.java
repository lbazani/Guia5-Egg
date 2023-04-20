
package guia5;

import java.util.Scanner;


public class Ejercicio13_gu {

    
    public static void main(String[] args) {
        
        //ejercicio 14
        
        Scanner sc = new Scanner (System.in);
        String compañero;
      String[] Equipo = new String[8];
        for (int i = 0; i < 8; i++) {
            System.out.println("Ingresa el nombre de un compañero");
            compañero = sc.next();
            Equipo [i] = compañero;
        }
        for (int i = 0; i < 8; i++) {
            System.out.println("[" + Equipo[i] + "]");
        }
        
      //ejemplo vector
      
      int vector[] = new int [5];
        for (int i = 0; i < 5; i++) {
            vector[i] = i + 1;
        }
        for (int i = 0; i < 5; i++) {
            System.out.println("[" + vector[i] + "]");
        }
        
      //ejemplo matriz
      
      String[][] matriz = new String [3][3];
      
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = "A";
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println("");
        }
    }
    
}
