package ifsc.poo;

public class Navio {
    private int tamanho;
    private boolean atingido[];

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
        this.atingido = new boolean[tamanho];
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

    public boolean isAfundado() {
        int atingido = 0;
        for (int i = 0; i < this.atingido[].length; i++){
            if (this.atingido[i] == true){ atingido++; }
        }
        return atingido == this.atingido[].length;
    }

    public boolean isAtingido(){
        for (int i = 0; i < this.atingido[].length; i++){
            if (this.atingido[i] == true) { return true; }
        }
    }

    public boolean bombardear(int linha, int coluna) {
        if (this.vertical){
            if (coluna == this.coluna){
                for (int i = 0; i < this.tamanho; i++){
                    if ((this.linha + i) == linha){
                        if(this.atingido[i] != true){
                            return true;
                        }
                    }
                }
            }
            return false;
        }
        if (!this.vertical){
            if (linha == this.linha){
                for (int i = 0; i < this.tamanho; i++){
                    if ((this.coluna + i) == coluna){
                        if(this.atingido[i] != true){
                            return true;
                        }
                    }
                }
            }
            return false;
        }
    }
}