import Carro.Carro;
import Cliente.Cliente;
import Venda.Venda;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Carro carro01 = new Carro();
        Cliente cliente01 =  new Cliente();
        carro01.cadastrarCarro();
        carro01.atualizarValorDesconto(30.00);
        System.out.println(carro01.getValorVenda());
    }
}