package herança;

import java.util.Date;
/**
 * Vendedor
 */
public class Vendedor extends Funcionario {

    private int totalItensVendidos;
    private float comissaoPorItem;

    public Vendedor(){
        super();
    }

    public float calcularSalario(){

        return super.getSalario() +(this.comissaoPorItem * totalItensVendidos);
    }

    public int getTotalItensVendidos() {
        return totalItensVendidos;
    }

    public float getComissaoPorItem() {
        return comissaoPorItem;
    }

    public void setTotalItensVendidos(int totalItensVendidos) {
        this.totalItensVendidos = totalItensVendidos;
    }

    public void setComissaoPorItem(float comissaoPorItem) {
        this.comissaoPorItem = comissaoPorItem;
    }
    

}