
package aula4exercio8;

import java.util.Scanner;
/*8) Uma revendedora de carros paga a seus vendedores um salário fixo equivalente a dois
salários-mínimos, mais uma comissão de R$ 150,00 por carro vendido e mais uma
comissão de 5% do valor das vendas. Crie um programa que leia o valor do salário-
mínimo, quantos carros o vendedor vendeu ao longo do mês e o valor total das vendas.
Após ler os dados, o programa deve calcular e apresentar o valor do salário do
funcionário.
*/
public class Aula4Exercio8 {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int quantV,  valorQ = 150;
        double valorS, salarioM, valorV, comicaoC, valorC, comicaoV , salario;
        
        
        System.out.println("Informe o Salario Minimo: ");
        salarioM = Double.valueOf(input.nextLine());
        System.out.println("Informe quantidade de carros vendido: ");
        quantV = Integer.valueOf(input.nextLine());
        System.out.println("Informe valor do carro vendido: ");
        valorV = Double.valueOf(input.nextLine());
        
        comicaoV = 0.05;
        
        valorS = salarioM * 2;
        comicaoC = quantV * valorQ;
        valorC = valorV * comicaoV;
        
        salario = valorS + comicaoC + valorC; 
        System.out.println("Salario do funcionario é : "+salario);
        
        
        
        
        
     
    }
    
}
