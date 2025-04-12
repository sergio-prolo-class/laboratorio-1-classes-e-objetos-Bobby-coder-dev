package ifsc.poo;

public class Produto{
    private String nome;
    private int preco;
    private int desconto;

    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }
    public void setPreco(int preco){
        this.preco = preco;
    }
    public float getPreco(){
        return this.preco;
    }
    public void setDesconto(int desconto){
        this.desconto = desconto;
    }
    public int getDesconto(){
        return this.desconto;
    }
    public String anuncio(){
        return String.format("%s: de R$ %d por APENAS R$ %.2f!", this.nome, this.preco, this.preco - (this.preco * this.desconto / 100.0));
    }
}