package empresa;

/**
 * Classe que representa um mês e ano.
 */
public class MesAno {

	private int ano;
	private int mes;
	
	/**
     * Construtor da classe MesAno.
     * 
     * @param mes O mês.
     * @param ano O ano.
     */
	public MesAno(int mes, int ano) {
		this.ano = ano;
		this.mes = mes;
	}
	
	/**
     * Obtém o ano.
     * 
     * @return O ano.
     */
	public int getAno() {
		return ano;
	}
	
	/**
     * Obtém o mês.
     * 
     * @return O mês.
     */
	public int getMes() {
		return mes;
	}
	
	/**
     * Calcula a diferença em anos entre este objeto MesAno e outro MesAno.
     * 
     * @param outro O outro objeto MesAno.
     * @return A diferença em anos entre este objeto e o outro objeto MesAno.
     */
	public int anosAte(MesAno outro) {
		int anosTrabalhado = outro.getAno() - this.getAno();
		if (outro.getMes() < this.getMes()) // Usando getMes() para acessar o mês do outro objeto
	        anosTrabalhado--;
	    if (anosTrabalhado < 0)
	        anosTrabalhado = 0;
	    return anosTrabalhado;
	}

	
}
