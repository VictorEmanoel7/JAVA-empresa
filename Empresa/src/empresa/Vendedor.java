package empresa;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe que representa um vendedor, que é um tipo específico de funcionário base e beneficiado.
 */
public final class Vendedor extends FuncionarioBase implements FuncionarioBeneficiado {

	private List<Venda> vendas;
	
	/**
     * Construtor da classe Vendedor.
     * 
     * @param nome             O nome do vendedor.
     * @param dataContratacao  A data de contratação do vendedor.
     */
	public Vendedor(String nome,MesAno dataContratacao) {
		super(nome,"Vendedor", dataContratacao, 12000.00, 1800.00);
		this.vendas = new ArrayList<>();
	}
	
	/**
     * Calcula o benefício do vendedor para um determinado mês e ano.
     * 
     * @param data O mês e ano para o qual o benefício deve ser calculado.
     * @return O benefício do vendedor para o mês e ano especificados.
     */
	@Override
	public double getBeneficio(MesAno data) {
		double totalVendasMes = calcularTotalVendasMes(data);
        return totalVendasMes * 0.3;
	}
	
	/**
     * Adiciona uma venda à lista de vendas do vendedor.
     * 
     * @param venda A venda a ser adicionada.
     */
	public void adicionarVenda(Venda venda) {
		vendas.add(venda);
	}
	
	/**
     * Calcula o total de vendas para um determinado mês e ano.
     * 
     * @param data O mês e ano para o qual o total de vendas deve ser calculado.
     * @return O total de vendas para o mês e ano especificados.
     */
	public double calcularTotalVendasMes(MesAno data) {
		 double totalVendas = 0.0;
	     for (Venda venda : vendas) {
	    	 if (venda.getData().getMes() == data.getMes() && venda.getData().getAno() == data.getAno()) {
	    		 totalVendas += venda.getValor();
	    	 }
	     }
	     return totalVendas;
	}
	
	/**
     * Obtém a lista de vendas do vendedor.
     * 
     * @return A lista de vendas do vendedor.
     */
	public List<Venda> getVendas() {
		return vendas;
	}

}
