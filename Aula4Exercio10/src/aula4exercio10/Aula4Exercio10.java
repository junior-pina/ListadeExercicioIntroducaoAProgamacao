package aula4exercio10;

import java.util.Scanner;


public class Aula4Exercio10 {
    /*
    Faça um programa que leia um número inteiro e apresente o quociente e o resto da
divisão deste número por 2.
    */

   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int n, quociente,r ;
        
        System.out.println("informe um numero");
        n = Integer.valueOf(input.nextLine());
        quociente = n / 2;
        r = n % 2;
        System.out.println("Quociente é: " +quociente+"\no Resto é: "+r);
    }
    
}
