package Cliente;
import javax.swing.JOptionPane;

public class Cliente {

    private int id;

    private String nome;

    private int idade;

    private double renda;
    public void cadastrarCliente() {
        this.id = Integer.parseInt(JOptionPane.showInputDialog("Digite o código do cliente"));
        this.nome = JOptionPane.showInputDialog("Digite o nome do cliente");
        do {
            this.idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do cliente (deve ser maior que 18):"));
            if (this.idade <= 18) {
                JOptionPane.showMessageDialog(null, "A idade deve ser maior que 18 anos. Tente novamente.");
            }
        } while (this.idade <= 18);
        this.renda = Double.parseDouble (JOptionPane.showInputDialog("Digite a renda do cliente"));
    }


    public String imprimirResumoCliente() {
        String msg = "Id: " + this.id + "\n";
        msg += "Nome: " + this.nome + "\n";
        msg += "Idade: " + this.idade + "\n";
        msg += "Renda: " + this.renda;
        return msg;

    }
    public double getRenda() {
        return this.renda;
    }
}
