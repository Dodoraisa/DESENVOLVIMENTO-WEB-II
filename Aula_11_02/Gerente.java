public class Gerente extends Funcionario implements Autenticavel {

    private String senha= "1234";

    
    @Override
    public String getFuncao(){
        return "Gerente";
    }

    public boolean login(String senha){

        if (this.senha == senha) {
            return true;
        }else{
            return false;
        }


    }

}
