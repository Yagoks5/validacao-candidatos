import java.util.Scanner;
public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        int parametroUm = 0, parametroDois = 0;

        // Loop para ler o primeiro parâmetro
        while (true) {
            System.out.println("Digite o primeiro parâmetro");
            try {
                parametroUm = terminal.nextInt();
                break; // Saia do loop se um número válido for inserido
            } catch (java.util.InputMismatchException e) {
                System.out.println("Erro: Insira um número inteiro válido.");
                terminal.next(); // Limpe o buffer de entrada
            }
        }

        // Loop para ler o segundo parâmetro
        while (true) {
            System.out.println("Digite o segundo parâmetro");
            try {
                parametroDois = terminal.nextInt();
                break; // Saia do loop se um número válido for inserido
            } catch (java.util.InputMismatchException e) {
                System.out.println("Erro: Insira um número inteiro válido.");
                terminal.next(); // Limpe o buffer de entrada
            }
        }

        contar(parametroUm, parametroDois);
    }

    static void contar(int parametroUm, int parametroDois) {
        if (parametroUm > parametroDois) {
            // Não deve acontecer, pois a exceção já foi tratada antes
            System.out.println("Erro: o segundo parâmetro deve ser maior que o primeiro.");
        } else {
            for (int i = parametroUm; i <= parametroDois; i++) {
                System.out.println("Imprimindo o número " + i);
            }
        }
    }
    
}
