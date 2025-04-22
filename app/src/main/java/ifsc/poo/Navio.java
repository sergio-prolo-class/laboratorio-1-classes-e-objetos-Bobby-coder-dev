package ifsc.poo;

public class Navio {
    private int tamanho;
    private int atingido;

    private int linha;
    private int coluna;

    private boolean vertical;

    private String letra;

    private boolean afundado;

    public Navio(int tamanho, int linha, int coluna, boolean vertical, char letra) {
        this.tamanho = tamanho;
        this.linha = linha;
        this.coluna = coluna;
        this.vertical = vertical;
        this.letra = letra;
        this.atingido = 0;
    }

    public char getLetra() {
        return letra;
    }

    public int getLinhaInicial() {
        return linha;
    }

    public int getColunaInicial() {
        return coluna;
    }

    public int getTamanho() {
        return tamanho;
    }

    public boolean isVertical() {
        return vertical;
    }


}