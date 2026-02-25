public class Cliente {
    String nome;
    String cpf;
    String numeroCNH;

    public Cliente(String nome, String cpf, String numeroCNH) {
        this.nome = nome;
        this.cpf = cpf;
        this.numeroCNH = numeroCNH;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNumeroCNH() {
        return numeroCNH;
    }

    public void setNumeroCNH(String numeroCNH) {
        this.numeroCNH = numeroCNH;
    }
    
    
}
