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
    
    void inserirEstoque(){
    	System.out.print("Digite codigo do produto: ");
        codigo = entrada.nextInt();

        System.out.print("Digite o nome do produto: ");
        nome = entrada.next();

        System.out.print("Digite a quantidade do produto: ");
        quantidade = entrada.nextInt();

        item.add(new Produto(nome,quantidade, codigo));
    }
    void visualizarEstoque(){
        System.out.println("##################################################################");
        System.out.println("                             ESTOQUE                              ");
        for(int i=0; i < item.size(); i++){
            System.out.println("Codigo: " + item.get(i).icodigo +
                    " Nome: " + item.get(i).nome +
                    "| Quantidade: " + item.get(i).quantidade);
        }
        System.out.println("##################################################################");
    }
    void remocaoIngrediente(int codigo, int quantidade) {
        int resposta = 1;
        if(resposta == 1){
            for(int i = 0; i < item.size(); i++){
                if(item.get(i).icodigo == codigo && item.get(i).quantidade >= quantidade){
                    item.get(i).quantidade = item.get(i).quantidade - quantidade;
                }
            }
        }
    }
    void producaoDentadura() throws InterruptedException{
        int codigoMorango = 1;
        int qtdMorango = 2;
        int codigoLeite = 2;
        int qtdLeite = 2;

        System.out.println("Produzindo .....");
        if(item.get(0).icodigo == codigoMorango && item.get(1).icodigo == codigoLeite ){
            if(item.get(0).quantidade >= qtdMorango && item.get(1).quantidade >= qtdLeite){

                this.dentadura += 1;
                remocaoIngrediente(codigoMorango,qtdMorango);
                remocaoIngrediente(codigoLeite, qtdLeite);
                Thread.sleep(400);
                System.out.println("Produzido com Sucesso .....");
                System.out.println("1 Dentadura Produzida com sucesso");
            } else{
                System.out.println("Falha na Produção!");
                System.out.println("Produtos Insuficientes");
            }
        }
    }
    void producaoAmoras() throws InterruptedException{
        int codigoMorango = 1;
        int codigoLeite = 2;
        int codigoAcucar = 3;
        int qtdMorango = 2;
        int qtdLeite = 2;
        int qtdAcucar = 1;
        
        System.out.println("Produzindo .....");
        if(
                item.get(0).icodigo == codigoMorango &&
                item.get(1).icodigo == codigoLeite &&
                item.get(2).icodigo == codigoAcucar
        ){
        if(
               item.get(0).quantidade >= qtdMorango &&
               item.get(1).quantidade >= qtdLeite &&
               item.get(2).quantidade >= qtdAcucar
        ){
                this.amoras += 1;
                remocaoIngrediente(codigoMorango,qtdMorango);
                remocaoIngrediente(codigoLeite, qtdLeite);
                remocaoIngrediente(codigoAcucar, qtdAcucar);
                Thread.sleep(400);
                System.out.println("Produzido com Sucesso .....");
                System.out.println("1 Amora Produzida com sucesso");
            } else{
                System.out.println("Falha na Produção!");
                System.out.println("Produtos Insuficientes");
            }
        }
    }
    void visualizarEstoqueProduzido(){
        System.out.println("##################################################################");
        System.out.println("                             ESTOQUE                              ");
        System.out.println(" Nome: Dentadura | Quantidade: " + dentadura);
        System.out.println(" Nome: Amoras | Quantidade: " + amoras);
        System.out.println("##################################################################");
    }
    void produtosExistentes(){
        System.out.println("##################################################################");
        System.out.println("                             INSERIR                              ");
        System.out.print(" QUAL CODIGO DO PRODUTO: ");
        idLocalizado = entrada.nextInt();
        System.out.print(" QUANTIDADE A INSERIR: ");
        qtdNova = entrada.nextInt();
        for (int i = 0; i < item.size(); i++) {
            if(idLocalizado == item.get(i).icodigo){
                item.get(i).quantidade += qtdNova;
                System.out.println(" Nome: " +  item.get(i).nome + " | Quantidade: " + qtdNova +
                        " Adicionados com Sucesso");
            }
        }

        System.out.println("##################################################################");
    }
    public void visualizarMenuProducao() throws InterruptedException{
        boolean telaAtiva = true;
        while (telaAtiva){
            System.out.println("#######################################");
            System.out.println("#               PRODUÇAO              #");
            System.out.println("#     1 - DENTADURA                   #");
            System.out.println("#     2 - AMORAS                      #");
            System.out.println("#     3 - VOLTAR                      #");
            System.out.println("#######################################");
            System.out.print("# OPCAO: ");
            int opc = entrada.nextInt();

            switch(opc){
                case 1:
                    producaoDentadura();
                break;
                case 2:
                    producaoAmoras();
                break;
                case 3:
                    telaAtiva = false;
                    System.out.println("Voltando...");
                    Thread.sleep(1500);
                break;
                default:
                    System.out.println("Opção Inválida!");
                    break;
            }
        }
    }
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

