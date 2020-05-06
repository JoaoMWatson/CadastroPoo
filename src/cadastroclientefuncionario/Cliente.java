package cadastroclientefuncionario;

public class Cliente extends Pessoa {
    int idCliente;
    int pontos;
   
    @Override 
    public void comprar(){
        pontos += carrinho + 1;
    }
}
