
package atividade.pkg125;

import java.util.Scanner;


public class Atividade125 {
    public static int leitura(String texto){
        System.out.println(texto);
        Scanner input = new Scanner(System.in);
        return Integer.parseInt(input.nextLine());
    }
    public static boolean informaTrueOrFalse(int n){
    int n4, n3 ,n2 ,n1;
    boolean palind;
    n4 =n/1000;
    n3 =(n%1000)/100;
    n2 =(n%1000)%100/10;
    n1 =(n%1000)%100%10;
    palind =n1==n4&&n2==n3;
    return palind;
            
    }
    public static void Palindromo(boolean x){
    if (x==true){
        System.out.println("Palindromo");
    }
    else {
        System.out.println("Não é um Palindromo");
    }
    }
    public static void main(String[] args) {
       int n;
       n = leitura("Digite um numero Inteiro, positivo, entre 0 e 9999");
       Palindromo(informaTrueOrFalse(n));
       
    }
    
}
