public class Pessoa {
    private String nome;
    private String rg;
    private String cpf;
    private String data;
    private String endere;


    public Pessoa(String nome, String rg, String cpf, String data, String endere) {
        this.nome = nome;
        this.rg = rg;
        this.cpf = cpf;
        this.data = data;
        this.endere = endere;
    }

    public String getNome(){
        return this.nome = nome;
    }

    public String getCpf() {
        return this.cpf = cpf;
    }

    public String getRg() {
        return this.rg = rg;
    }

    public String getData() {
        return this.data = data;
    }

    public String getEndere(){

        return this.endere = endere;
    }

    public String dados(){
        return String.format("\nNome: %s \nRG: %s \nCPF: %s \nData: %s \nEndereço: %s",
                this.getNome(),
                this.getRg(),
                this.getCpf(),
                this.getData(),
                this.getEndere());
    }
}
