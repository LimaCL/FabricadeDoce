import model.Produto;

import java.util.ArrayList;
import java.util.Scanner;

public class Inventario {
	
    Scanner entrada = new Scanner(System.in);
    ArrayList<Produto> item = new ArrayList<>();
    String nome;
    int quantidade;
    int codigo;
    int dentadura = 2;
    int amoras = 2;
    int qtdNova;
    int idLocalizado;
    public void visualizarMenuEstoque() throws InterruptedException {

        boolean telaAtiva = true;
        while (telaAtiva) {
            System.out.println("#######################################");
            System.out.println("#               ESTOQUE               #");
            System.out.println("#     1 - INSERIR PRODUTOS NOVOS      #");
            System.out.println("#     2 - INSERIR PRODUTOS            #");
            System.out.println("#     3 - CONSULTAR                   #");
            System.out.println("#     4 - PRODUÇÃO                    #");
            System.out.println("#     5 - ITENS PRODUZIDOS            #");
            System.out.println("#     6 - VOLTAR                      #");
            System.out.println("#######################################");
            System.out.print("# OPÇÃO: ");
            int op = entrada.nextInt();

            switch (op) {
            case 1:
                    inserirEstoque();
                    break;
                case 2:
                    produtosExistentes();
                    break;
                case 3:
                    visualizarEstoque();
                    break;
                case 4:
                    visualizarMenuProducao();
                    break;
                case 5:
                    visualizarEstoqueProduzido();
                    break;
                case 6:
                    telaAtiva = false;
                    System.out.println("Voltando...");
                    Thread.sleep(1500);
                    break;
                default:
                    System.out.println("Opção Inválida");
                    break;
            }
        }
    }
   }

