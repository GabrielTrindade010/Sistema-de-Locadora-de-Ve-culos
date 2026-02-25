public class Locacao {
    Cliente cliente;
    Veiculo veiculo;
    int quantidadeDeDias;
    double valorSeguro;
    double taxasExtras;

    public Locacao(Cliente cliente,
            Veiculo veiculo,
            int quantidadeDeDias,
            double valorSeguro,
            double taxasExtras) {
        
        this.cliente = cliente;
        this.veiculo = veiculo;
        this.quantidadeDeDias = quantidadeDeDias;
        this.valorSeguro = valorSeguro;
        this.taxasExtras = taxasExtras;
        
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public int getQuantidadeDeDias() {
        return quantidadeDeDias;
    }

    public void setQuantidadeDeDias(int quantidadeDeDias) {
        this.quantidadeDeDias = quantidadeDeDias;
    }

    public double getValorSeguro() {
        return valorSeguro;
    }

    public void setValorSeguro(double valorSeguro) {
        this.valorSeguro = valorSeguro;
    }

    public double getTaxasExtras() {
        return taxasExtras;
    }

    public void setTaxasExtras(double taxasExtras) {
        this.taxasExtras = taxasExtras;
    }
    
    /*
        
        Métodos obrigatórios:

        calcularTotalDiarias()

        calcularSeguro()

        calcularSubtotal()

        aplicarMulta(atrasoDias)

        calcularTotalFinal()
    
    */
    
    public double calcularTotalDiarias(double valorDiaria, int quantidadeDeDias) {
        double resultado = valorDiaria * quantidadeDeDias;
        
        return resultado;
    }
    
    public double calcularSeguro(double subTotal, double percentualSeguro) {
        double resultado = subTotal * percentualSeguro / 100;
        
        return resultado;
    }
    
    public double aplicarMulta(double valorDiaria, int diasAtraso) {
        double resultado = valorDiaria * diasAtraso * 1.5;
        
        return resultado;
    }
    
    public double calcularSubTotal(double valorDiaria, int quantidadeDeDias) {
        double resultado = valorDiaria * quantidadeDeDias;
        
        return resultado;
    }
    
    
    public double calcularTotalFinal(double subTotal,
            double seguro,
            double taxasExtras,
            double multa) {
        
        double resultado = subTotal + seguro + taxasExtras + multa;
        
        return resultado;
        
    }
}
