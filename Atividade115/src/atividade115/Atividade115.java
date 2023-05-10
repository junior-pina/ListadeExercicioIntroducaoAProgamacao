
package atividade115;

import java.util.Scanner;


public class Atividade115 {

   
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       
        System.out.println("Informe Nota1:");
        float nota1 = Float.parseFloat(input.nextLine());
        System.out.println("Informe Nota1:");
        float nota2 = Float.parseFloat(input.nextLine());
        System.out.println("Informe Nota1:");
        float nota3 = Float.parseFloat(input.nextLine());
        System.out.println("Infome qual tipo de Media 'A-Ariimetica'P-Ponderada''G-geometrica");
        char tipo = input.nextLine().charAt(0);
        
        float media = calculoMedia(nota1, nota2, nota3, tipo);
        System.out.println("Média : "+media);
                
        
            
        }
        public static float calculoMedia(float nota1,float nota2, float nota3, char tipo){
            
        
            switch (tipo){ 
            case 'A':
                return(nota1 + nota2 + nota3)/3;
            case 'P':
                return (nota1+ nota2*2 +nota3*2) /5;
            case 'G':
                return(float) Math.pow(nota1*nota2*nota3, (float)1/3);
            }
        return 0;
        
        }

    
}
