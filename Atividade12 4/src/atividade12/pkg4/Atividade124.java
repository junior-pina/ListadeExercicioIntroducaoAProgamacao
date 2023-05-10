
package atividade12.pkg4;

import java.util.Scanner;


public class Atividade124 {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Informe um Numero Inteiro");
        int numero = Integer.parseInt(input.nextLine());
        
        CalculoRaiz(numero);
       
    }
    public static boolean CalculoRaiz(int numero){
       double resultado = Math.sqrt(numero);
       if (numero % resultado == 0){
           System.out.println("o valor da raiz é inteira");
       return true;
       
       }else {System.out.println(" o valor da raiz não e inteira");
           return false;
                   }
    }
}
