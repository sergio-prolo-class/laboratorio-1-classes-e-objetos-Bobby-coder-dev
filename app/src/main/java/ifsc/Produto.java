package ifsc.poo;

public class Produto{
    private String nome;
    private final String codigo;
    private int preco;
    private int desconto;
    private static int numProdutos = 0;

    private static final int LIMITE_REGISTROS = 50;
    private static final Produto[] maxProdutos = new Produto[LIMITE_REGISTROS];
    private static int totalCriados = 0;

    public Produto(String nome, int preco){
        this.nome = nome;
        this.preco = preco;
        this.desconto = 0;

        int milhar = numProdutos / 1000;
        int unidade = numProdutos % 1000;

        this.codigo = String.format("CD:%3d-%3d", milhar, unidade);
        numProdutos++;
        totalCriados++;

        maxProdutos[totalCriados] = this;
        totalCriados = (totalCriados + 1) % maxProdutos.length;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }

    public String getCodigo(){
        return this.codigo;
    }

    public void setPreco(int preco){
        this.preco = preco;
    }
    public float getPreco(){
        return (float) this.preco - (float)(this.preco * this.desconto / 100.0);
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
    public static String[] exportarCSV() {
        int registros;
        if (totalCriados > LIMITE_REGISTROS) {
            registros = LIMITE_REGISTROS;
        } else {
            registros = totalCriados;
        }
        String[] linhas = new String[LIMITE_REGISTROS + 1];
        
        linhas[0] = "Código;Nome;Preço;Desconto";

        for (int i = 0; i < registros; i++) {
            Produto p = maxProdutos[(totalCriados - registros + i) % LIMITE_REGISTROS];
            String precoFormatado = String.format("%.2f", p.getPreco()).replace('.', ',');
            linhas[i + 1] = String.format("%s;%s;%s;%d", p.codigo, p.nome, precoFormatado, p.desconto);
        }
        return linhas;
    }
}