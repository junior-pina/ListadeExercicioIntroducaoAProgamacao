
package listaexercicio4.pkg4;

import java.util.Scanner;

public class ListaExercicio44 {

        /*4) Escreva um programa que leia a temperatura em graus Celsius e apresente a
        temperatura correspondente em graus Fahrenheit, usando a fórmula abaixo. Crie uma
        função para fazer a conversão.*/
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Informe a Temperatura em graus Celcius:");
        double celsius = Double.parseDouble(input.nextLine());
        
        double convercao = convercaoCemF(celsius);
        
        System.out.println(celsius+"° Celsius é equivale a: "+convercao+"° Fahrenheit");
        
        
    }
    public static double  convercaoCemF(double celsius){
     
     return   9.0 / 5.0 * celsius + 32;
    }
    }
    

