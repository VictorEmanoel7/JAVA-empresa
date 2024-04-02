package empresa;

/**
 * Classe que representa um gerente, que é um tipo específico de funcionário base.
 */
public class Gerente extends FuncionarioBase {
	
    /**
     * Construtor da classe Gerente.
     * 
     * @param nome             O nome do gerente.
     * @param dataContratacao  A data de contratação do gerente.
     */
    public Gerente(String nome,MesAno dataContratacao) {
        super(nome, "Gerente", dataContratacao, 20000.00, 3000.00);
    }

}
