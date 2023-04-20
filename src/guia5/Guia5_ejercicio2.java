package guia5;

import java.util.Random;
import java.util.Scanner;

public class Guia5_ejercicio2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random num = new Random();
        int tamaño, buscar, random, vuelta;
        System.out.println("Ingrese el tamaño del vector");
        tamaño = sc.nextInt();
        int[] vector = new int[tamaño];
        System.out.println("Ingrese un numero a buscar en el vector, entre el 0 y el 10");
        buscar = sc.nextInt();
        //vuelta = 0;

        for (int i = 0; i < tamaño; i++) {
            //random = Random.nextInt();
            vector[i] = num.nextInt(10) + 1;
            System.out.print(vector[i] + " ");
        }
        System.out.println(" ");
        for (int i = 0; i < tamaño; i++) {

            if (vector[i] == buscar) {
                //vuelta = vuelta + 1;
                System.out.println("El numero se encuentra en la posición " + i);
            }
        }
    }

}
