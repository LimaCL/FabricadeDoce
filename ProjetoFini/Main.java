import javax.sound.midi.Soundbank;
import javax.swing.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Usuario user = new Usuario();
        Scanner entrada = new Scanner(java.lang.System.in);

        while (true) {

            java.lang.System.out.println("Bem-vindo ao DOCES CORPORATION");


            while (!user.nome.equals("admin") && !user.senha.equals("123")) {
                java.lang.System.out.print("Login: ");
                user.nome = entrada.nextLine();

                java.lang.System.out.print("Senha: ");
                user.senha = entrada.nextLine();

                if (!user.nome.equals("admin") && !user.senha.equals("123")) {
                    java.lang.System.out.println("Login ou senha incorretos. Tente Novamente.");
                }
            }

            java.lang.System.out.println("Login realizado com sucesso!!!");

            java.lang.System.out.println("DOCES CORPORATION");
            java.lang.System.out.println("-----------------------------");
            java.lang.System.out.println(" ******** Menu ******** ");
            java.lang.System.out.println(" ### 1 - VENDAS   ### ");
            java.lang.System.out.println(" ### 2 - PRODUÇÃO ### ");
            java.lang.System.out.println(" ### 3 - ESTOQUE  ### ");
            java.lang.System.out.println(" ### 4 - SAIR     ###");
            java.lang.System.out.println("-----------------------------");

            int opcao = 0;

            do {
                java.lang.System.out.print("Qual opção desejada: ");
                opcao = entrada.nextInt();

                switch (opcao){
                    case 1:
                        java.lang.System.out.println("VOCÊ ESCOLHEU DEPARTAMENTO DE VENDAS");
                        break;
                    case 2:
                        java.lang.System.out.println("VOCÊ ESCOLHEU DEPARTAMENTO DE PRODUÇÃO");
                        break;
                    case 3:
                        java.lang.System.out.println("VOCÊ ESCOLHEU DEPARTAMENTO DE ESTOQUE");
                        break;
                    case 4:
                        java.lang.System.out.println("Saindo do sistema...");
                        break;
                    default:
                        java.lang.System.out.println("Opção Inválida");
                        break;
                }
            } while (opcao != 4);

            java.lang.System.out.println("Retornando a tela de login........");
        }
    }
}
