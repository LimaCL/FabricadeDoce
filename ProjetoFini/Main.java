import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws InterruptedException {

        Usuario user = new Usuario();
        user.nome = "";
        user.senha = "";
        Scanner entrada = new Scanner(java.lang.System.in);
        Inventario estoque = new Inventario();
        Vendas vendas = new Vendas();
        while (true) {

            System.out.println("#         DOCES CORPORATION        #");
            System.out.println("####################################");
            System.out.println("#              1-LOGIN             #");
            System.out.println("#              2-SAIR              #");
            System.out.println("####################################");
            System.out.print("# DIGITE A OPÇÃO: ");
            int escolha = entrada.nextInt();
            switch (escolha) {
                case 1:
                    while(!user.nome.equals("admin") || !user.senha.equals("1234")){

                        System.out.print("Login: ");
                        user.nome = entrada.next();
                        System.out.print("Senha: ");
                        user.senha = entrada.next();

                        if(!user.nome.equals("admin") || !user.senha.equals("1234")){
                            System.out.println("Login ou senha incorretos. Tente Novamente.");
                        }
                    }
                    break;
                case 2:
                    System.out.println("#            FECHANDO...           #");
                    Thread.sleep(2000);
                    Runtime.getRuntime().exit(0);
                    break;
            }
            System.out.println("#    LOGIN EFETUADO COM SUCESSO    #");
            System.out.println("#            ENTRANDO...           #");
            Thread.sleep(1500);
            int opcao = 0;
            do {
                System.out.println("DOCES CORPORATION");
                System.out.println("#############################");
                System.out.println(" ###### Menu ######## ");
                System.out.println(" ### 1 - VENDAS   ### ");
                System.out.println(" ### 2 - ESTOQUE  ### ");
                System.out.println(" ### 3 - SAIR     ###");
                System.out.println("#############################");
                System.out.print("# OPÇÃO: ");
                opcao = entrada.nextInt();

                switch (opcao) {
                    case 1:
                        vendas.menuVendas();
                        break;
                    case 2:
                        estoque.visualizarMenuEstoque();
                        break;
                    case 3:
                        System.out.println("Saindo do sistema...");
                        break;
                    default:
                        System.out.println("Opção Inválida");
                        break;
                }
            } while (opcao != 3);
            user.nome = "";
            user.senha = "";
            System.out.println("Retornando a tela de login........");
            Thread.sleep(2000);
        }
    }
}
