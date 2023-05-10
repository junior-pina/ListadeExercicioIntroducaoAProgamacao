
package listadeexerxio4.pkg7;

import java.util.Scanner;


public class LIstadeExerxio47 {
    /*7) Faça um programa que leia o saldo da conta de um cliente e a taxa de juros de um
determinado mês. O programa deve ter uma função que recebe como parâmetro estes
valores, calcula e retorna o novo saldo. Por fim, o programa deve apresentar o novo saldo
da conta após o recebimento do valor correspondente aos juros daquele mês.*/

   
      public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.println("Informe o Solda da Conta:");
        double saldo = Double.parseDouble(input.nextLine());
        System.out.println("Informe A taxa de juro do Mês:");
        double taxa= Double.parseDouble(input.nextLine());
        
      double novoSaldo = novoSaldo(saldo,taxa); 
      
        System.out.println("Seu novo saldo Apos Aplicação de juro do mês é: "+novoSaldo);
              
      
    }
    public static double novoSaldo(double saldo,double taxa){
    double juro = saldo * (taxa / 100);
    double novoSaldo = saldo + juro;
    return novoSaldo;
    }
    
}
