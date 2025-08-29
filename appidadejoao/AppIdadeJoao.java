package appidadejoao;
import  java.util.Scanner;


public class AppIdadeJoao {

    
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Digite o ano de nascimento de João: ");
        int anoNascimento = scanner.nextInt();

        
        System.out.print("Digite o ano atual: ");
        int anoAtual = scanner.nextInt();

        
        scanner.close();

        
        int idadeAtual = anoAtual - anoNascimento;

      
        int idadeEm2016 = 2016 - anoNascimento;

        
        System.out.println("\n--- Resultados ---");
        System.out.println("João tem " + idadeAtual + " anos.");
        System.out.println("João terá " + idadeEm2016 + " anos em 2016.");
    }
    
}
