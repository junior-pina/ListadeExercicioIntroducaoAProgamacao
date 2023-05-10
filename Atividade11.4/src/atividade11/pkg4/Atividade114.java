
package atividade11.pkg4;

import java.util.Scanner;

public class Atividade114 {

 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Informe  um numero:");
        int numero = Integer.parseInt(input.nextLine());
        
        if (numero < 0){
            System.out.println("Imaginario");
        }else {
            double raizQuadrada = Math.sqrt(numero);
            System.out.println("a raiz Quadra de "+numero+" é: "+raizQuadrada);
        }
        
        
    }
    
}
