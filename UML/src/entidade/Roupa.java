package entidade;

public class Roupa {
    private String marca;
    private String tipo;
    private String tamanho;
    private int quantidade;
    private double valor;

    public Roupa(String marca, String tipo, String tamanho, int quantidadeInicial, double valorInicial){
        this.marca = marca;
        this.tipo = tipo;
        this.tamanho = tamanho;
        this.quantidade = quantidadeInicial;
        this.valor = valorInicial;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getValor() {
        return valor;
    }

    public void adicinaQuantidade(int quantidade){
        this.quantidade += quantidade;
        valorTotal();
    }

    public void removeQuantidade(int quantidade){
        this.quantidade -= quantidade;
        valorTotal();
    }

    public void valorTotal(){
        this.valor *= this.quantidade;
    }

    @Override
    public String toString() {
        return "Marca: " + marca
                + "\nTipo: " + tipo
                + "\nTamanho: " + tamanho
                + "\nQuantidade: " + quantidade
                + "\nTotal R$: " + String.format("%.2f", valor);
    }
}