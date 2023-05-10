
package listade3exer6;

import java.util.Scanner;


public class Listade3Exer6 {
 //6) Faça um algoritmo que leia 3 números inteiros distintos e escreva o menor deles.

    public static void main(String[] args) {
                Scanner input = new Scanner(System.in);

        System.out.println("Inorme Três Numero Inteiro Distinto:");
        int num1 = Integer.parseInt(input.nextLine());
         int num2 = Integer.parseInt(input.nextLine());
          int num3 = Integer.parseInt(input.nextLine());
          
        int menor = Math.min(Math.min(num1, num2),num3);
        System.out.println("o Menor Numero é "+menor);
        
      /*
       int menor = num1;
       
       if (num2 < menor){
           menor =num2;
       }
       if (num3 < menor){
           menor= num3;
       }
            System.out.println("o menor Numero é: "+menor);
       */ 
        
   
    }
    
}
