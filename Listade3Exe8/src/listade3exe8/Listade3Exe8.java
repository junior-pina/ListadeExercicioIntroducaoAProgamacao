
package listade3exe8;

import java.util.Scanner;

public class Listade3Exe8 {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.println("Informe o nome do Funcuonário:");
        String nome = input.nextLine();
        System.out.println("Informe a categoria do funcionário(A a H):");
        String  categoria = input.nextLine();
        System.out.println("informe o ultimo Salarario:");
        double salario = Double.parseDouble(input.nextLine());
        
        double aumento = 0.0;
        
        switch (categoria.toUpperCase()){
            case "A":
            case "H":
                aumento = 0.1;
                break;
            case"B":
            case"D":
            case"E":
                aumento = 0.15;
                break;
            case "C":
            case "F":
                aumento = 0.25;
                break;
            default:
                aumento = 0.3;
                break;
        }
        
        double salarioR = salario * (1 + aumento);
        
        System.out.println("Nome: "+nome);
        System.out.println("Categoria: "+categoria);
        System.out.println("Salario Reajustado: "+salarioR);
        
        
        
        
        
    }
    
}
