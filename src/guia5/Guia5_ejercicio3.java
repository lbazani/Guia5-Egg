package guia5;

import java.util.Random;
import java.util.Scanner;

public class Guia5_ejercicio3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random num = new Random();
        int tamaño;
        System.out.println("Ingrese el tamaño del vector");
        int[] vector = new int[tamaño = sc.nextInt()];

        for (int i = 0; i < tamaño; i++) {
            vector[i] = num.nextInt(99999) + 1;
            System.out.print(vector[i] + " ");
        }
        System.out.println(" ");
        int cont1 = 0, cont2 = 0, cont3 = 0, cont4 = 0, cont5 = 0;
        for (int i = 0; i < tamaño; i++) {
            if (vector[i] < 9) {
                cont1++;
            } else if (vector[i] > 9 && vector[i] < 100) {
                cont2++;
            } else if (vector[i] > 99 && vector[i] < 1000) {
                cont3++;
            } else if (vector[i] > 999 && vector[i] < 10000) {
                cont4++;
            } else if (vector[i] > 9999 && vector[i] < 100000) {
                cont5++;
            }

        }
        System.out.println("La cantidad de numeros de un digito es: " + cont1 + " , la de dos digitos es: " + cont2 + " , la de tres digitos es: " + cont3 + " ,la de cuatro digitos es: " + cont4 + " y la de cinto digitos es: " + cont5);

    }

}
