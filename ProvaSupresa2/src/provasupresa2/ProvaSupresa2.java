
package provasupresa2;

import java.util.Scanner;


public class ProvaSupresa2 {

  
    public static void main(String[] args) {
       Scanner input = new Scanner (System.in);
       
        System.out.println("Digite um numero:");
        int nun1 = Integer.parseInt(input.nextLine());
        System.out.println("Digite outro numero");
        int nun2 = Integer.parseInt(input.nextLine());
        
        if (nun1> nun2){
        int dife = nun1 % nun2;                
        System.out.println("a Diferença entre  eles é "+dife);
        }else { 
            int dife = nun2 % nun1;
            System.out.println("a Diferença enre eles é "+dife);
        }
        
        
    }
    
}
