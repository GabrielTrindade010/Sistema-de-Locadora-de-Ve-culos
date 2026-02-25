import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // TODO code application logic here

        /*
        
            O que a Main deve fazer:
        
            Perguntar dados do veículo

            Perguntar dados do cliente

            Perguntar dias de locação

            Perguntar percentual de seguro

            Perguntar taxas extras

            Perguntar dias de atraso

            Perguntar cotação do dólar

            Exibir:

            ===== RESUMO DO CONTRATO =====
            Cliente:
            Veículo:
            Dias:
            Subtotal:
            Seguro:
            Multa:
            Total em Reais:
            Total em Dólar:
        
        */
        
        Scanner entrada = new Scanner(System.in);
        
        /*====================
            DADOS DO VEÍCULO
          ====================
        */
        
        String modelo_veiculo;
        String marca_veiculo;
        String categoria_veiculo;
        double valorDiaria_veiculo;
        
        System.out.println("Seja Bem-Vindo ao SISTEMA DE LOCADORA DE VEÍCULOS");
        
        System.out.println("Digite o Modelo do Veículo: ");
        modelo_veiculo = entrada.nextLine();
        
        System.out.println("Digite a Marca do Veículo: ");
        marca_veiculo = entrada.nextLine();
        
        System.out.println("Digite a Categoria do Veículo: ");
        categoria_veiculo = entrada.nextLine();
        
        System.out.println("Digite o Valor da Diária do Veículo: ");
        valorDiaria_veiculo = entrada.nextDouble();
        
        Veiculo veiculo = new Veiculo(modelo_veiculo, marca_veiculo, categoria_veiculo, valorDiaria_veiculo);
        
        /*====================
          DADOS DO CLIENTE
          ====================
        */
        
        entrada.nextLine(); // Limpando buffer
        
        String nome_cliente;
        String cpf_cliente;
        String numeroCNH_cliente;
        
        System.out.println("Digite o Nome do Cliente: ");
        nome_cliente = entrada.nextLine();
        
        System.out.println("Digite o CPF do Cliente: ");
        cpf_cliente = entrada.nextLine();
        
        System.out.println("Digite a CNH do Cliente: ");
        numeroCNH_cliente = entrada.nextLine();
        
        Cliente cliente = new Cliente(nome_cliente, cpf_cliente, numeroCNH_cliente);
        
        /*====================
          DADOS DA LOCAÇÃO
          ====================
        */
        
        int quantidadeDeDias_locacao;
        double percentualSeguro_locacao;
        double taxasExtras_locacao;
        int diasAtraso;
        double cotacaoDolar;
        String formaPagamento;
        
        System.out.println("Digite a Quantidade de Dias para a Locação: ");
        quantidadeDeDias_locacao = entrada.nextInt();
        
        System.out.println("Digite o Percentual do Seguro da Locação: ");
        percentualSeguro_locacao = entrada.nextDouble();
        
        System.out.println("Digite as Taxas Extras da Locação: ");
        taxasExtras_locacao = entrada.nextDouble();
        
        Locacao locacao = new Locacao(cliente,
                veiculo,
                quantidadeDeDias_locacao,
                percentualSeguro_locacao,
                taxasExtras_locacao);
        
        System.out.println("Dias de Atraso: ");
        diasAtraso = entrada.nextInt();
        
        
        System.out.println("Digite a Cotação do Dólar Atual: ");
        cotacaoDolar = entrada.nextDouble();
        
        System.out.println("Qual será a Forma de Pagamento ? ");
        formaPagamento = entrada.nextLine();
        
        
        /*====================
            DADOS DO CONTRATO
          ====================
        */
        
        int numeroContrato = (int) (Math.random() * 1000);
        Contrato contrato = new Contrato(numeroContrato, locacao, formaPagamento);
        
        /* ===== RESUMO DO CONTRATO =====
            Cliente:
            Veículo:
            Dias:
            Subtotal:
            Seguro:
            Multa:
            Total em Reais:
            Total em Dólar:*/
        
        double subTotal = locacao.calcularSubTotal(valorDiaria_veiculo, quantidadeDeDias_locacao);
        double totalDiarias = locacao.calcularTotalDiarias(valorDiaria_veiculo, quantidadeDeDias_locacao);
        double totalSeguro = locacao.calcularSeguro(subTotal, percentualSeguro_locacao);
        double totalMulta = locacao.aplicarMulta(totalDiarias, diasAtraso);
        double totalFinal = locacao.calcularTotalFinal(subTotal, totalSeguro, totalSeguro, totalMulta);
        double totalReais = contrato.converterDolarParaReal(totalFinal, cotacaoDolar);
        
        System.out.println("\n=========== RESUMO DO CONTRATO ===========");
        System.out.printf("Cliente: %s%n", cliente.getNome());
        System.out.printf("Veículo: %s%n", veiculo.getMarca());
        System.out.printf("Dias: %d%n", locacao.getQuantidadeDeDias());
        System.out.printf("Subtotal: R$ %.2f%n", subTotal);
        System.out.printf("Seguro: R$ %.2f%n", totalSeguro);
        System.out.printf("Multa: R$ %.2f%n", totalMulta);
        System.out.printf("Total em Dólar: US$ %.2f%n", totalFinal);
        System.out.printf("Total em Reais: R$ %.2f%n", totalReais);
        System.out.println("===========================================");
        
    }
    
}
