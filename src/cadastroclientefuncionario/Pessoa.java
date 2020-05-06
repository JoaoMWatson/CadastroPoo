package cadastroclientefuncionario;

public class Pessoa {
    String nome;
    int idade;
    String cpf;
    String rg;
    int carrinho;
    
    public void comprar(){
        carrinho += 1;
    }
    
    public void devolver(){
        carrinho -= 1;
    }
}
