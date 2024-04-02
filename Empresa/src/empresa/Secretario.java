package empresa;

/**
 * Classe que representa um secretário, que é um tipo específico de funcionário base e beneficiado.
 */
public class Secretario extends FuncionarioBase implements FuncionarioBeneficiado {

	/**
     * Construtor da classe Secretario.
     * 
     * @param nome             O nome do secretário.
     * @param dataContratacao  A data de contratação do secretário.
     */
	public Secretario(String nome,MesAno dataContratacao) {
		super(nome,"Secretario", dataContratacao, 7000.00, 1000.00);
	}
	
	/**
     * Calcula o benefício do secretário para um determinado mês e ano.
     * 
     * @param data O mês e ano para o qual o benefício deve ser calculado.
     * @return O benefício do secretário para o mês e ano especificados.
     */
	@Override
	public double getBeneficio(MesAno data) {
		return getSalario(data) * 0.2;
	}
}
