package ifsc.poo;

public class Retangulo {
    private float largura;
    private float altura;

    public void setLargura(float largura) {
        if (largura <= 0) {
            System.out.println("Largura inválida");
            return;
        }
        this.largura = largura;
    }

    public void setAltura(float altura) {
        if (altura <= 0) {
            System.out.println("Altura inválida");
            return;
        }
        this.altura = altura;
    }

    public float getArea () {
        return this.largura * this.altura;
    }

    public float getPerimetro () {
        return 2 * (this.largura + this.altura);
    }
}