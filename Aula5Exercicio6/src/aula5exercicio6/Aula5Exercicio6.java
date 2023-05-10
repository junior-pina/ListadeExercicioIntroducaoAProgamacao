
package aula5exercicio6;

import java.util.Scanner;


public class Aula5Exercicio6 {

  
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        float prova1, prova2, trabalho,f;
        boolean r;
        
        System.out.println("informe a Notra da prova 1:");
        prova1 = Float.valueOf(input.nextLine());
        System.out.println("informe a Notra da prova 2:");
        prova2 = Float.valueOf(input.nextLine());
        System.out.println("informe a Notra do trabalho :");
        trabalho = Float.valueOf(input.nextLine());
        System.out.println("Informe a frequncia do aluno: ");
        f = Float.valueOf(input.nextLine());
        
        r = (((trabalho >=7) &&  (prova1 >=6 || prova2 >=6)) && ((f>= 75) || (trabalho >= 6 && f>= 90)));
         
          
        
        System.out.println("Aprovado: "+r);
        
    }
    
}
