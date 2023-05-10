package aula4exercio9;

import java.util.Scanner;


public class Aula4Exercio9 {
    /*
9) Uma pessoa foi ao supermercado e comprou:
Q quilos de café, cujo custo unitário é X;
L litros de leite, cujo custo unitário é Y;
B pacotes de bolacha, cujo custo unitário é Z.
Faça um programa que leia estes dados e imprima, para cada produto: nome do produto,
total gasto com ele. Além disto, ele deve apresentar o total gasto na compra.
    */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int qCafe, lLeite, bB;
        float cCafe, cLeite, cBolacha, gCafe, gLeite, gBolacha, gTotal;
        
        System.out.println("Digite Quantidade de Café: ");
        qCafe = Integer.valueOf(input.nextLine());
        System.out.println("Informe o valor Unitario do Café: ");
        cCafe = Float.valueOf(input.nextLine());
        
        System.out.println("Digite Quantos litros de leite: ");
        lLeite = Integer.valueOf(input.nextLine());
        System.out.println("Informe o valor Unitario cada Litro de leite: ");
        cLeite = Float.valueOf(input.nextLine());
        
        System.out.println("Digite Quantos pacote de bolacha: ");
        bB = Integer.valueOf(input.nextLine());
        System.out.println("Informe o valor de cada Unidade de pacote de bolacha: ");
        cBolacha = Float.valueOf(input.nextLine());
        
        gCafe = qCafe * cCafe;
        gLeite = lLeite * cLeite;
        gBolacha = bB * cBolacha;
        gTotal = gCafe + gLeite + gBolacha;
        
        System.out.println("Gastos com Café: " +gCafe+"\nGastos com Leite: "+gLeite+"\nGastos com Bolacha: "+gBolacha);
        System.out.println("Total Gastos:"+gTotal);
        
        
        
    }
    
}
