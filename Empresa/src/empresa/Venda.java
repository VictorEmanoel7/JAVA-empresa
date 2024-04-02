package empresa;

/**
 * Classe que representa uma venda.
 */
public class Venda {
    
    private MesAno data;
    private double valor;
    
    /**
     * Construtor da classe Venda.
     * 
     * @param data  A data da venda.
     * @param valor O valor da venda.
     */
    public Venda(MesAno data, double valor) {
        super();
        this.data = data;
        this.valor = valor;
    }
	
    /**
     * Obtém a data da venda.
     * 
     * @return A data da venda.
     */
    public MesAno getData() {
        return data;
    }
    
    /**
     * Obtém o valor da venda.
     * 
     * @return O valor da venda.
     */
    public double getValor() {
    return valor;
    }
}
