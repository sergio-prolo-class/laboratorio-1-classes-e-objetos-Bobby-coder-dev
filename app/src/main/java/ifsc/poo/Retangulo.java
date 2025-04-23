package ifsc.poo;

public class Retangulo {
    private float largura;
    private float altura;


    public Retangulo(float largura, float altura){
        setLargura(largura);
        setAltura(altura);
    }

    public boolean setLargura(float largura) {
        if (largura <= 0) {
            this.largura = 1;
            return false;
        }
        this.largura = largura;
        return true;
    }

    public boolean setAltura(float altura) {
        if (altura <= 0) {
            this.altura = 1;
            return false;
        }
        this.altura = altura;
        return true;
    }

    public float getArea () {
        return this.largura * this.altura;
    }

    public float getPerimetro () {
        return 2 * (this.largura + this.altura);
    }
}