import javax.sound.midi.Soundbank;
import javax.swing.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        boolean ansewrs_autentication;
        Usuario user = new Usuario();
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o seu Usuário: ");
        user.nome = entrada.next();

        System.out.print("Digite sua senha: ");
        user.senha = entrada.next();

        ansewrs_autentication = user.autentication(user.nome, user.senha);

        do{
            if(ansewrs_autentication == true){
                System.out.println("FINI CORPORATION");
                System.out.println("-----------------------------");
                System.out.println(" ******** Menu ******** ");
                System.out.println(" ### V - VENDAS   ### ");
                System.out.println(" ### P - PRODUÇÃO ### ");
                System.out.println(" ### E - ESTOQUE  ### ");
                System.out.println(" ### S - SAIR     ###");
                System.out.println("-----------------------------");
                System.out.print("Qual opção desejada: ");
                String opcao = entrada.next();

                if(opcao.equalsIgnoreCase("s") || opcao.equalsIgnoreCase("S")){
                    ansewrs_autentication = false;
                }
            }
            else {
                System.out.println("Permissão Negada");
            }
        } while(ansewrs_autentication == true);
            System.out.println("Obrigado por usar o Sistema!!!");
            entrada.close();

    }
}
