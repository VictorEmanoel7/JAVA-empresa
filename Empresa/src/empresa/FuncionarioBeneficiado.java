package empresa;
    
/**
 * Interface que define o comportamento de um funcionário beneficiado, estendendo a interface Funcionario.
 */
public interface FuncionarioBeneficiado extends Funcionario {
    
    /**
     * Obtém o benefício do funcionário para um determinado mês e ano.
     * 
     * @param data O mês e ano para o qual o benefício deve ser calculado.
     * @return O benefício do funcionário para o mês e ano especificados.
     */
    double getBeneficio(MesAno data);
}
