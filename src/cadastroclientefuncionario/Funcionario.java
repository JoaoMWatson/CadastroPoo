package cadastroclientefuncionario;


public class Funcionario extends Pessoa {
    int salario;
    int idFuncionario;
    String Cargo;
    String carteiraDeTrabalho;
    int comissao;
    
    @Override
    public void comprar(){
        carrinho += 2;
        comissao += 1;
    }
    
}
