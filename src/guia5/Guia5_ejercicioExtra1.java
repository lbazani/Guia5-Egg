
package guia5;

import java.util.Scanner;


public class Guia5_ejercicioExtra1 {

    
    public static void main(String[] args) {
     Scanner sc = new Scanner (System.in);
     int tamaño,suma,num;
        System.out.println("Ingrese el tamaño del vector");
        tamaño = sc.nextInt();
     int [] vector = new int [tamaño];
        System.out.println("Ingrese los valores que componen el vector");
     suma=0;
        for (int i = 0; i < tamaño; i++) {
          num = sc.nextInt();
          vector [i] = i+1;
          suma = suma + num;
        }
        for (int i = 0; i < 1; i++) {
            System.out.println("La suma de los elementos del vector es: " + suma);
        }
    }
    
}
