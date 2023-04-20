
package guia5;

import java.util.Random;


public class Guia5_ejercicio4 {

   
    public static void main(String[] args) {
      Random num = new Random();
      int [][] matriz = new int [4][4];
      
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz [i][j] = num.nextInt(10) + 1;
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(" ");
        }
        System.out.println("=============");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matriz[j][i] + " ");
            }
            System.out.println(" ");
        }
        
    }
    
}
