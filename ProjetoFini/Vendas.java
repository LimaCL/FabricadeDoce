import java.util.ArrayList;
import java.util.Scanner;

public class Vendas {

    Scanner entrada = new Scanner(System.in);
    Inventario estoque = new Inventario();
    double valorDentadura = 10.50;
    double valorAmora = 7.00;
    ArrayList<Venda> carrinho = new ArrayList<>();
    void inserirCarrinho(String nome, double valor, int quantidade){
            carrinho.add(new Venda(nome, valor, quantidade));
    }
    void listaProdutos() throws InterruptedException{
        boolean telaAtiva = true;

        while (telaAtiva){
            System.out.println("###################################");
            System.out.println("#         LISTA DE PRODUTOS       #");
            System.out.println("#         1 - DENTADURA  Qtd: " + estoque.dentadura);
            System.out.println("#         2 - AMORAS     Qtd: " + estoque.amoras);
            System.out.println("#         3 - VOLTAR              #");
            System.out.println("###################################");
            System.out.println("Qual código do produto deseja inserir no carrinho: ");
            int opc = entrada.nextInt();

            int qtd;
            switch (opc){
                case 1:
                    System.out.println("Quantidade a ser inserida: ");
                    qtd = entrada.nextInt();
                    inserirCarrinho("Dentadura", valorDentadura, qtd);
                    break;
                case 2:
                    System.out.println("Quantidade a ser inserida: ");
                    qtd = entrada.nextInt();
                    inserirCarrinho("Amoras", valorAmora, qtd);
                    break;
                case 3:
                    telaAtiva = false;
                    System.out.println("Voltando...");
                    Thread.sleep(500);
                break;
                default:
                    System.out.println("Opção Inválida");
                    break;
            }
        }
    }
    void finalizarCompras(){
        System.out.println("##############################");
        System.out.println("#         CARRINHO           #");
        for (int i = 0; i < carrinho.size() ; i++) {
            System.out.println("Nome: " + carrinho.get(i).nome
            + " Preço: " + (carrinho.get(i).valor * carrinho.get(i).quantidade)
            + " Quantidade: " + carrinho.get(i).quantidade + " Preço Unitário: " + valorDentadura ) ;
        }
        System.out.println("##############################");
        System.out.println("Deseja Finalizar 1 - SIM ou 2 - NÃO: " );
        int opc = entrada.nextInt();
        if (opc == 1){
            if(carrinho.get(0).nome.equalsIgnoreCase("dentadura")){
                estoque.dentadura -= carrinho.get(0).quantidade;
            }
        } else
        {
            System.out.println("Operação Cancelada");
        }
    }
    void menuVendas() throws InterruptedException{
        boolean telaAtiva = true;
        while (telaAtiva){
            System.out.println("######################################");
            System.out.println("#               VENDAS               #");
            System.out.println("#       1 - PRODUTOS                 #");
            System.out.println("#       2 - FINALIZAR COMPRAS        #");
            System.out.println("#            3 - SAIR                #");
            System.out.println("######################################");
            System.out.print("OPÇÃO: ");
            int opc = entrada.nextInt();

            switch (opc){
                case 1:
                   listaProdutos();
                    break;
                case 2:
                    finalizarCompras();
                    break;
                case 3:
                    telaAtiva = false;
                    System.out.println("Voltando...");
                    Thread.sleep(500);
                    break;
            }
        }
    }
}
