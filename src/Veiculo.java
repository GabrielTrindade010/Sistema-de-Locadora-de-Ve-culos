public class Veiculo {
    String modelo;
    String marca;
    String categoria;
    double valorDiaria;

    public Veiculo(String modelo, String marca, String categoria, double valorDiaria) {
        this.modelo = modelo;
        this.marca = marca;
        this.categoria = categoria;
        this.valorDiaria = valorDiaria;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double getValorDiaria() {
        return valorDiaria;
    }

    public void setValorDiaria(double valorDiaria) {
        this.valorDiaria = valorDiaria;
    }
    
    
}
