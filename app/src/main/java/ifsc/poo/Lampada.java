package ifsc.poo;

public class Lampada{
    private boolean ligada;
    private static int num_lampadas;

    public Lampada(boolean ligada){
        this.ligada = ligada;
        num_lampadas++;
    }

    public boolean ligar(){
        if(this.ligada == true){
            return false;
        } else {
            this.ligada = true;
            return true;
        }
    }

    public boolean desligar(){
        if(this.ligada == false){
            return false;
        } else {
            this.ligada = false;
            return true;
        }
    }

    public boolean verEstado(){
        return this.ligada;
    }

    public static int contar_lampadas(){
        return num_lampadas;
    }
}