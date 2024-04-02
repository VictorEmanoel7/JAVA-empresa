package empresa;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe que representa uma empresa e suas operações.
 */
public class Empresa {

    List<Funcionario> funcionarios;
    
    /**
     * Construtor da classe Empresa.
     */
    public Empresa() {
        this.funcionarios = new ArrayList<>();
    }
    
    /**
     * Adiciona um funcionário à lista de funcionários da empresa.
     * 
     * @param funcionario O funcionário a ser adicionado.
     */
    public void adicionarFuncionario(Funcionario funcionario) {
        this.funcionarios.add(funcionario);
    }
    
    /**
     * Calcula o total a ser pago aos funcionários da empresa no mês e ano especificados, incluindo benefícios.
     * 
     * @param funcionarios A lista de funcionários da empresa.
     * @param data         O mês e ano para o qual o total deve ser calculado.
     * @return O total a ser pago aos funcionários.
     */
    public static double totalPagar(List<Funcionario> funcionarios, MesAno data) {
        double totalPago = 0.0;
        for (Funcionario funcionario : funcionarios) {
            totalPago += funcionario.getSalario(data);
            if (funcionario instanceof FuncionarioBeneficiado) {
                totalPago += ((FuncionarioBeneficiado) funcionario).getBeneficio(data);
            }
        }
        return totalPago;
    }
    
    /**
     * Calcula o total a ser pago em salários aos funcionários da empresa no mês e ano especificados.
     * 
     * @param funcionarios A lista de funcionários da empresa.
     * @param data         O mês e ano para o qual o total deve ser calculado.
     * @return O total a ser pago em salários aos funcionários.
     */
    public static double totalPagarSalario(List<Funcionario> funcionarios, MesAno data) {
        double totalPago = 0.0;
        for (Funcionario funcionario : funcionarios) {
            totalPago += funcionario.getSalario(data);
        }
        return totalPago;
    }
    
    /**
     * Calcula o total a ser pago em benefícios aos funcionários beneficiados da empresa no mês e ano especificados.
     * 
     * @param funcionarios A lista de funcionários da empresa.
     * @param data         O mês e ano para o qual o total deve ser calculado.
     * @return O total a ser pago em benefícios aos funcionários beneficiados.
     */
    public static double totalPagarBeneficio(List<Funcionario> funcionarios, MesAno data) {
        double totalPago = 0.0;
        for (Funcionario funcionario : funcionarios) {
            if (funcionario instanceof FuncionarioBeneficiado) {
                totalPago += ((FuncionarioBeneficiado) funcionario).getBeneficio(data);
            }
        }
        return totalPago;
    }
    
    /**
     * Encontra o funcionário com o maior valor total pago (salário + benefício) no mês e ano especificados.
     * 
     * @param funcionarios A lista de funcionários da empresa.
     * @param data         O mês e ano para o qual o valor total deve ser calculado.
     * @return O funcionário com o maior valor total pago.
     */
    public static Funcionario funcionarioMaiorValor(List<Funcionario> funcionarios, MesAno data) {
        Funcionario funcionarioMaiorValor = null;
        double maiorSalarioTotal = 0.0;
        
        for (Funcionario funcionario : funcionarios) {
            double salarioTotal = funcionario.getSalario(data);
            if (funcionario instanceof FuncionarioBeneficiado) {
                salarioTotal += ((FuncionarioBeneficiado) funcionario).getBeneficio(data);
            }
            
            if (salarioTotal > maiorSalarioTotal) {
                maiorSalarioTotal = salarioTotal;
                funcionarioMaiorValor = funcionario;
            }
        }
        
        return funcionarioMaiorValor;
    }

    /**
     * Encontra o nome do funcionário beneficiado com o maior valor de benefícios no mês e ano especificados.
     * 
     * @param funcionarios A lista de funcionários da empresa.
     * @param data         O mês e ano para o qual o valor de benefícios deve ser calculado.
     * @return O nome do funcionário beneficiado com o maior valor de benefícios.
     */
    public static String funcionarioMaiorValorBeneficios(List<Funcionario> funcionarios, MesAno data) {
        String nomeFuncionarioMaiorValor = null;
        double maiorValorBeneficios = 0.0;
        
        for (Funcionario funcionario : funcionarios) {
            if (funcionario instanceof FuncionarioBeneficiado) {
                double valorBeneficios = ((FuncionarioBeneficiado) funcionario).getBeneficio(data);
                
                if (valorBeneficios > maiorValorBeneficios) {
                    maiorValorBeneficios = valorBeneficios;
                    nomeFuncionarioMaiorValor = funcionario.getNome();
                }
            }
        }
        
        return nomeFuncionarioMaiorValor;
    }
    
    /**
     * Encontra o vendedor que mais vendeu no mês e ano especificados.
     * 
     * @param funcionarios A lista de funcionários da empresa.
     * @param data         O mês e ano para o qual as vendas devem ser verificadas.
     * @return O vendedor que mais vendeu.
     */
    public static Vendedor vendedorMaisVendeu(List<Funcionario> funcionarios, MesAno data) {
        Vendedor vendedorMaisVendeu = null;
        double maiorTotalVendas = 0.0;
        
        for (Funcionario funcionario : funcionarios) {
            if (funcionario instanceof Vendedor) {
                Vendedor vendedor = (Vendedor) funcionario;
                double totalVendas = vendedor.calcularTotalVendasMes(data);
                
                if (totalVendas > maiorTotalVendas) {
                    maiorTotalVendas = totalVendas;
                    vendedorMaisVendeu = vendedor;
                }
            }
        }
        
        return vendedorMaisVendeu;
    }
}
