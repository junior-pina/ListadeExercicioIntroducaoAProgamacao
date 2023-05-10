
package atividade12.pkg3;

import java.util.Scanner;


public class Atividade123 {


    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        char carac;
        
        System.out.println(" Informe um caractere");
        carac = input.nextLine().charAt(0);
        
        
        int resultado = verificarCaractere(Character.toLowerCase(carac));
        System.out.println(""+resultado);
       
        
    }
    public static char  verificarCaractere(char carac){
        if (carac == 'a' || carac =='e' || carac=='i' || carac =='o'  || carac =='u'){
              System.out.println(""+carac+" é vogal");
            return 1;
            
        }System.out.println("não e vogal");
        return 0;
    }
}
