package herança;
import java.util.Date;
public class Main {
    public static void main(String[] args) {
        Vendedor v = new Vendedor();
        v.setNome("Rodrigo");
        v.setSalario(1000.0f);
        v.setCpf("473937297");
        v.setDataNascimento(new Date());
        v.setTotalItensVendidos(10);

        System.out.println("O salário do vendedor é " +v.calcularSalario());

        Motorista n = new Motorista();
        n.setNome("Carlos");
        n.setSalario(100.0f);
        n.setCpf("6747847983");
        n.setDataNascimento(new Date());
        n.setCnh("73487377893");
        n.setCategoria('b');
    }
}
