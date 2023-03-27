public class Usuario {


    String nome;
    int idade;
    String senha;

    boolean autentication(String nome, String senha){
        if(nome.equalsIgnoreCase("teste") && senha.equalsIgnoreCase("123456")){
            return true;
        } else {
            return false;
        }
    }


}
