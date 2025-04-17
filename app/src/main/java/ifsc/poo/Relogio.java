package ifsc.poo;

public class Relogio{
    private byte hora;
    private byte minuto;
    private byte segundo;

    public Relogio(byte hora, byte minuto, byte segundo){
        if (!ajustaHora(hora, minuto, segundo)){
            ajustaHora((byte)0, (byte)0 , (byte)0);
        }
    }

    public boolean ajustaHora(byte hora, byte minuto, byte segundo){
        boolean invalido = true;
        if(hora >= 0 && hora < 24){
            this.hora = hora;
        }else{
            invalido = false;
        }
        if(minuto >= 0 && minuto < 60){
            this.minuto = minuto;
        }else{
            invalido = false;
        }
        if(segundo >= 0 && segundo < 60){
            this.segundo = segundo;
        }else{
            invalido = false;
        }

        return invalido;
    }

    public String getHora(){
        return String.format("%02d:%02d:%02d", hora, minuto, segundo);
    }

    public void avancaHora(){
        this.hora++;
        if(hora == 24){
            hora = 0;
        }
    }

    public void avancaMinuto(){
        this.minuto++;
        if(minuto == 60){
            avancaHora();
            minuto = 0;
        }
    }

    public void avancaSegundo(){
        this.segundo++;
        if(segundo == 60){
            avancaMinuto();
            segundo = 0;
        }
    }

    public void sincronizaRelogio (Relogio b){
        ajustaHora(b.hora,b.minuto,b.segundo); 
    }

    public int diferencaRelogio (Relogio b){
        int difHora = b.hora - this.hora;
        if(difHora < 0) {difHora *= -1;}
        int difMinuto = b.minuto - this.minuto;
        if(difMinuto < 0) {difMinuto *= -1;}
        int difSegundo = b.segundo - this.segundo;
        if(difSegundo < 0) {difSegundo *= -1;}

        return difSegundo + (difMinuto * 60) + (difHora * 3600);
    }
}   