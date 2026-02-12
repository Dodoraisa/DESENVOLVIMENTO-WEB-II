public abstract class  Funcionario{

    private static final double SALARIO_MINIMO = 1621;



    private String nome;
    private Double salario;
    private String cpf;

   



    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }



    public double getSalario() {
        return salario.doubleValue();
    }


    public void setSalario(Double salario) {
        if (salario < SALARIO_MINIMO ) {
           System.out.println("ta menor que o salario minimo");
        }    
        else{
            this.salario = salario.doubleValue();
            System.out.println("salario alterado para: " + this.salario);
        }
    
    }



    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        if (cpf.length() == 11) {
            this.cpf = cpf;
            System.out.println("cpf aterado para: " +  this.cpf);
        }
        else{
            System.out.println("CPF invalido");
        }
    }



    public abstract String getFuncao();
    
    
}