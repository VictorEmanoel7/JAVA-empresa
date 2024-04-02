package empresa;
/**
 * Classe abstrata que representa um funcionário base, implementando parte da funcionalidade da interface Funcionario.
 */
public abstract class FuncionarioBase implements Funcionario {
	
	private String nome;
	private String cargo;
	private MesAno dataContratacao;
	private double salarioBase;
	private double bonusAnual;
	
	/**
     * Construtor da classe FuncionarioBase.
     * 
     * @param nome              O nome do funcionário.
     * @param cargo             O cargo do funcionário.
     * @param dataContratacao   A data de contratação do funcionário.
     * @param salarioBase       O salário base do funcionário.
     * @param bonusAnual        O bônus anual do funcionário.
     */
	public FuncionarioBase(String nome,String cargo, MesAno dataContratacao, double salarioBase, double bonusAnual) {
		this.nome = nome;
		this.cargo = cargo; 
		this.dataContratacao = dataContratacao;
		this.salarioBase = salarioBase;
		this.bonusAnual = bonusAnual;
	}
	
	/**
     * Calcula o salário do funcionário para um determinado mês e ano.
     * 
     * @param data O mês e ano para o qual o salário deve ser calculado.
     * @return O salário do funcionário para o mês e ano especificados.
     */
	@Override
	public double getSalario(MesAno data) {
		return salarioBase + dataContratacao.anosAte(data) * bonusAnual;
	}
	
	/**
     * Obtém o nome do funcionário.
     * 
     * @return O nome do funcionário.
     */
	@Override
	public String getNome() {
		return nome;
	}
	
	/**
     * Obtém o cargo do funcionário.
     * 
     * @return O cargo do funcionário.
     */
	public String getCargo() {
		return cargo;
	}
	 
	/**
     * Obtém a data de contratação do funcionário.
     * 
     * @return A data de contratação do funcionário.
     */
	@Override
	public MesAno getDataContratacao() {
		return dataContratacao;
	}
	
	/**
     * Obtém o salário base do funcionário.
     * 
     * @return O salário base do funcionário.
     */
	public double getSalarioBase() {
		return salarioBase;
	}
	 
	/**
     * Obtém o bônus anual do funcionário.
     * 
     * @return O bônus anual do funcionário.
     */
	public double getBonusAnual() {
		return bonusAnual;
	}

}
