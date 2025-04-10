package ifsc.poo;

public class Relogio{
    private byte hora;
    private byte minuto;
    private byte segundo;

    public void ajustaHora(byte hora, byte minuto, byte segundo){
        if(hora >= 0 && hora < 24){
            this.hora = hora;
        }else{
            System.out.println("Hora inválida");
        }
        if(minuto >= 0 && minuto < 60){
            this.minuto = minuto;
        }else{
            System.out.println("Minuto inválido");
        }
        if(segundo >= 0 && segundo < 60){
            this.segundo = segundo;
        }else{
            System.out.println("Segundo inválido");
        }
    }

    public String getHora(){
        return String.format("%02d:%02d:%02d", hora, minuto, segundo);
    }

    public void avancaHora(){
        hora++;
        if(hora == 24){
            hora = 0;
        }
    }

    public void avancaMinuto(){
        minuto++;
        if(minuto == 60){
            minuto = 0;
            hora++;
            if(hora == 24){
                hora = 0;
            }
        }
    }

    public void avancaSegundo(){
        segundo++;
        if(segundo == 60){
            segundo = 0;
            minuto++;
            if(minuto == 60){
                minuto = 0;
                hora++;
                if(hora == 24){
                    hora = 0;
                }
            }
        }
    }



}   