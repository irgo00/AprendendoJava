package aprendizado.EstruturaDeDados.AulaED2703array.src;

public class Carro {

    private String marca;
    private int anoFabricacao;
    private int anoModelo;
    private String modelo;
    private String cor;
    private double preco;

    public Carro() {    
        marca = "";
        anoFabricacao = 2024;
        anoModelo = 2024;
        modelo = "";
        cor = "branco";
        preco = 100000.00;        
    }

    public Carro(String marca, int anoFabricacao, int anoModelo, String modelo, String cor, double preco) {
        this.marca = marca;
        this.anoFabricacao = anoFabricacao;
        this.anoModelo = anoModelo;
        this.modelo = modelo;
        this.cor = cor;
        this.preco = preco;
    }
    
    

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public int getAnoModelo() {
        return anoModelo;
    }

    public void setAnoModelo(int anoModelo) {
        this.anoModelo = anoModelo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Carro{" + "marca=" + marca + ", anoFabricacao=" + anoFabricacao + ", anoModelo=" + anoModelo + ", modelo=" + modelo + ", cor=" + cor + ", preco=" + preco + '}';
    }

    
    

    
    
    
}
