
package aula5exercicio7;

import java.util.Scanner;


public class Aula5Exercicio7 {

   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       
        int altura, comp,largura, areaPiso, volume, areaParede ; 
        boolean  arPequeno, arMedio,arGrande;
        
        System.out.println("Informe a Altura: ");
        altura = Integer.valueOf(input.nextLine());
        System.out.println("Informe o comprimento: ");
        comp = Integer.valueOf(input.nextLine());
        System.out.println("Informe a Largura: ");
        largura = Integer.valueOf(input.nextLine());
        
        areaPiso = comp  * largura;  
        areaParede = 2 * altura * (comp + largura);
        volume = comp * largura * altura;
        
        System.out.printf("areea do piso é: "+ areaPiso+"m²\n");
        System.out.print("o volume da sala é: "+volume+"m³ \n");
        System.out.printf("areea da Parede é: "+ areaParede+ "m²\n");
        
        arPequeno = (volume < 100);
        arMedio = (volume >= 100 && volume <= 500);
        arGrande = volume >= 500;
        
        System.out.println("Ar Pequeno: "+arPequeno);
        System.out.println("Ar Médio: "+ arMedio);
        System.out.println("Ar Grande: "+ arGrande);
    }
    
}
