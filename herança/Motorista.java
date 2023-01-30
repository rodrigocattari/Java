package herança;

import java.util.Date;

public class Motorista extends Funcionario {

    private String cnh;
    private char categoria;

    public Motorista(){
        super();
    }

    public String getCnh() {
        return cnh;
    }

    public char getCategoria() {
        return categoria;
    }

    public void setCnh(String cnh) {
        this.cnh = cnh;
    }

    public void setCategoria(char categoria) {
        this.categoria = categoria;
    }

    


    
}
