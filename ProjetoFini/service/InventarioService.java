package service;

import model.Produto;
import java.util.ArrayList;

public class InventarioService {

    ArrayList<Produto> item = new ArrayList<>();
    int dentadura = 1;
    int codigo;

    String nome;
    
	int codigoMorango = 1;
	int codigoLeite = 2;
	int codigoAcucar = 3;
	

	void producaoAmoras() throws InterruptedException{
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
	
	void producaoDentadura() throws InterruptedException{
        int qtdMorango = 2;
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
	 
	 void inserirEstoque(){
	    	System.out.print("Digite codigo do produto: ");
	        codigo = entrada.nextInt();

	        System.out.print("Digite o nome do produto: ");
	        nome = entrada.next();

	        System.out.print("Digite a quantidade do produto: ");
	        quantidade = entrada.nextInt();

	        item.add(new Produto(nome,quantidade, codigo));
	    }
}
