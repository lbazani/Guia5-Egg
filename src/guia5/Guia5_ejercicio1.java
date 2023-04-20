
package guia5;


public class Guia5_ejercicio1 {

    
    public static void main(String[] args) {
     int Vector[] = new int [100];
        for (int i = 99; i > -1; i--) {
         Vector[i] = i+1; 
          
        }
        for (int i = 99; i > -1; i--) {
            System.out.println("[" + Vector[i] + "]");
        }
    }
    
}
