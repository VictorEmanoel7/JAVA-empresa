package empresa;

/**
 * Classe de entrada que contém o método main para demonstrar o funcionamento do sistema da empresa.
 */
public class Main {

	public static void main(String[] args) {
		
		Empresa empresa = new Empresa();
		MesAno mesAnoContracaoS1 = new MesAno(1,2018);
		MesAno mesAnoContracaoS2 = new MesAno(12,2015);
		MesAno mesAnoContracaoV1 = new MesAno(12,2021);
		MesAno mesAnoContracaoG1 = new MesAno(7,2017);
		MesAno mesAnoContracaoG2 = new MesAno(3,2014);
		MesAno venda1 = new MesAno(12,2021);
		MesAno venda2 = new MesAno(1,2022);
		MesAno venda3 = new MesAno(2,2022);
		MesAno venda4 = new MesAno(3,2022);
		MesAno venda5 = new MesAno(4,2022);
		MesAno mesAnoAvaliacao = new MesAno(4,2022);
		
		Vendedor vendedor1 = new Vendedor("Ana Silva",mesAnoContracaoV1);
		Vendedor vendedor2 = new Vendedor("João Mendes",mesAnoContracaoV1);
		
		Venda venda1Vendedor1 = new Venda(venda1, 5200.00);
		Venda venda2Vendedor1 = new Venda(venda2, 4000.00);
		Venda venda3Vendedor1 = new Venda(venda3, 4200.00);
		Venda venda4Vendedor1 = new Venda(venda4, 5870.00);
		Venda venda5Vendedor1 = new Venda(venda5, 7000.00);
		
		Venda venda1Vendedor2 = new Venda(venda1, 3400.00);
		Venda venda2Vendedor2 = new Venda(venda2, 7700.00);
		Venda venda3Vendedor2 = new Venda(venda3, 500000);
		Venda venda4Vendedor2 = new Venda(venda4, 5900.00);
		Venda venda5Vendedor2 = new Venda(venda5, 6500.00);

		vendedor1.adicionarVenda(venda1Vendedor1);
		vendedor1.adicionarVenda(venda2Vendedor1);
		vendedor1.adicionarVenda(venda3Vendedor1);
		vendedor1.adicionarVenda(venda4Vendedor1);
		vendedor1.adicionarVenda(venda5Vendedor1);
		
		vendedor2.adicionarVenda(venda1Vendedor2);
		vendedor2.adicionarVenda(venda2Vendedor2);
		vendedor2.adicionarVenda(venda3Vendedor2);
		vendedor2.adicionarVenda(venda4Vendedor2);
		vendedor2.adicionarVenda(venda5Vendedor2);
		
		empresa.adicionarFuncionario(vendedor1);
		empresa.adicionarFuncionario(vendedor2);
	
		empresa.adicionarFuncionario(new Secretario("Jorge Carvalho",  mesAnoContracaoS1));
		empresa.adicionarFuncionario(new Secretario("Maria Souza",  mesAnoContracaoS2));
		empresa.adicionarFuncionario(new Gerente("Juliana Alves", mesAnoContracaoG1));
		empresa.adicionarFuncionario(new Gerente("Bento Albino", mesAnoContracaoG2));
	
		double totalPago = Empresa.totalPagar(empresa.funcionarios,mesAnoAvaliacao);
		System.out.println("Total pago (salário, benefício e bonus): " + totalPago);
		
		double totalPagoSemBene = Empresa.totalPagarSalario(empresa.funcionarios,mesAnoAvaliacao); 
		System.out.println("Total pago (salário e bonus): " + totalPagoSemBene);
		
		double totalPagoBene = Empresa.totalPagarBeneficio(empresa.funcionarios,mesAnoAvaliacao);
		System.out.println("Total pago (Beneficio sem salario e bonus): " + totalPagoBene);
		
		Funcionario funciMaior = Empresa.funcionarioMaiorValor(empresa.funcionarios,mesAnoAvaliacao);
		
		if (funciMaior != null) {
		    System.out.println("Funcionário com o maior pagamento: " + funciMaior.getNome());
		} else {
		    System.out.println("Não há funcionários na lista.");
		}
		
		String funciMaiorBene = Empresa.funcionarioMaiorValorBeneficios(empresa.funcionarios,mesAnoAvaliacao);
		System.out.println("Nome do funcionário com o maior Beneficio: " + funciMaiorBene);
		
		Vendedor melhorVendedor = empresa.vendedorMaisVendeu(empresa.funcionarios, mesAnoAvaliacao);
		if (melhorVendedor != null) {
		    System.out.println("Melhor vendedor do mês: " + melhorVendedor.getNome());
		} else {
		    System.out.println("Não há melhor vendedor para este mês.");
		}
	
	}

}