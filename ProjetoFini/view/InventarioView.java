
public class InventarioView {

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
    
    void visualizarEstoqueProduzido(){
        System.out.println("##################################################################");
        System.out.println("                             ESTOQUE                              ");
        System.out.println(" Nome: Dentadura | Quantidade: " + dentadura);
        System.out.println(" Nome: Amoras | Quantidade: " + amoras);
        System.out.println("##################################################################");
    }
}
