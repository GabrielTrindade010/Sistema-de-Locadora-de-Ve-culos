public class Contrato {
    int numeroContrato;
    Locacao locacao;
    String formaPagamento;

    public Contrato(int numeroContrato, Locacao locacao, String formaPagamento) {
        this.numeroContrato = numeroContrato;
        this.locacao = locacao;
        this.formaPagamento = formaPagamento;
    }

    public int getNumeroContrato() {
        return numeroContrato;
    }

    public void setNumeroContrato(int numeroContrato) {
        this.numeroContrato = numeroContrato;
    }

    public Locacao getLocacao() {
        return locacao;
    }

    public void setLocacao(Locacao locacao) {
        this.locacao = locacao;
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }
    
    /*
        
        Métodos:

        converterRealParaDolar()

        converterDolarParaReal()
        
    */
    
    public double converterRealParaDolar(double valorEmReais, double cotacao) {
        double resultado = valorEmReais / cotacao;
        
        return resultado;
    }
    
    public double converterDolarParaReal(double valorEmDolar, double cotacao) {
        double resultado = valorEmDolar * cotacao;
        
        return resultado;
    }
}
