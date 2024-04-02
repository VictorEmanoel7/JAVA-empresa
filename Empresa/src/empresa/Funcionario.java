package empresa;
/**
 * Interface que define o comportamento básico de um funcionário.
 */
public interface Funcionario {
	/**
     * Obtém o salário do funcionário para um determinado mês e ano.
     * 
     * @param data O mês e ano para o qual o salário deve ser calculado.
     * @return O salário do funcionário para o mês e ano especificados.
     */
	double getSalario(MesAno data);
	 /**
     * Obtém o nome do funcionário.
     * 
     * @return O nome do funcionário.
     */
	String getNome();
	/**
     * Obtém a data de contratação do funcionário.
     * 
     * @return A data de contratação do funcionário.
     */
	MesAno getDataContratacao();
}
