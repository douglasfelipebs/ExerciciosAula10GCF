
import java.util.Scanner;

/**
 * Exercícios para aula à distância da matéria de Gerência da Configuração
 * Universidade do Estado de Santa Catarina (UDESC)
 * Centro de Educação Superior do Alto-Vale do Itajaí (CEAVI)
 * @author Douglas Felipe Bussmann Siedschlag
 * @since 12/10/2018
 */
public class Main {
    
    static Scanner s = new Scanner(System.in);
    static String menu = "Informe uma operação a ser realizada:"
            + "\n 1 - Tabuada;"
            + "\n 2 - Fatorial;"
            + "\n 0 - Sair;";
    
    public static void main(String[] args) {
        while(true){
            System.out.println(menu);
            String opcaoToConvert = s.nextLine();
            int opcao = -1;
            try {
                opcao = Integer.parseInt(opcaoToConvert);
            } catch (Exception e) {
            }
            
            switch(opcao){
                case 1:{
                    tabuada();
                    break;
                }
                case 2:{
                    System.out.println("Informe o número a ser mutiplicado:");
                    String numeroToConvert = s.nextLine();
                    int numero = 0;
                    try {
                        numero = Integer.parseInt(numeroToConvert);
                    } catch (Exception e) {
                        System.out.println("Número inválido! (O valor deve ser numérico)");
                        break;
                    }
                    if(numero < 0){
                        System.out.println("Número inválido! (O valor deve ser positivo)");
                        break;
                    }
                    System.out.println(fatorial(1, numero));
                    break;
                }
                case 0:{
                    System.exit(0);
                }
                default: {
                    System.out.println("Selecione uma opção numérica válida!");
                    break;
                }
            }
        }
    }
    
    public static void tabuada(){
        System.out.println("Informe o número a ser mutiplicado:");
        String numeroToConvert = s.nextLine();
        int numero = Integer.MIN_VALUE;
        try {
            numero = Integer.parseInt(numeroToConvert);
        } catch (Exception e) {
        }
        if(numero == Integer.MIN_VALUE){
            System.out.println("Número inválido! (O valor deve ser numérico)");
        } else {
            for (int i = 1; i <= 10; i++) {
                System.out.println(i + "\tx\t" + numero + "\t=\t" + (i*numero));
            }
        }
    }
    
    public static int fatorial(int total, int valor){
        if(valor == 1){
            return total;
        }
        total *= valor;
        valor--;
        return fatorial(total, valor);
    }
}
