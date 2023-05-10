
 
package aula5exercicio2;

import java.util.Scanner;

/*2) Crie um programa que leia o preço do quilowatt de energia e a quantidade gasta de
quilowatts em uma residência. O programa deve calcular e imprimir o valor a ser pago
pela residência caso a conta seja paga no dia e o valor a ser pago caso a conta seja paga
em atraso. Caso a conta seja paga em atraso, deve-se acrescentar 10% sobre o valor da
conta. O programa não deve perguntar se a conta será paga em atraso ou não, ele deve
sempre calcular e apresentar os dois valores, para que o usuário analise a diferença e
decida se vai pagar a conta em dia ou não.*/


public class Aula5Exercicio2 {

  
    public static void main(String[] args) {
 
        Scanner input = new Scanner(System.in);
       
       double preco, qQuilo, conta, contaA;
       
        System.out.println("Informe o Preço do Quilowatt: ");
        preco = Double.valueOf(input.nextLine());
        System.out.println("Informe quantidade de QuiloWatt Gasto");
        qQuilo = Double.valueOf(input.nextLine());
        
        conta = preco * qQuilo;
        contaA = (conta * 10/100) + conta;
        
        System.out.println("______________________________________________");
        System.out.println("PAGAR CONTA  AGORA || PAGAR CONTA COM ATRASO");
        System.out.println("______________________________________________");
        System.out.println("       "+ conta+"        || "+"          " + contaA  );
       
    } 
    
}
