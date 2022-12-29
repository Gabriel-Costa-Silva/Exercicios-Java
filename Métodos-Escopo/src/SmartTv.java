public class SmartTv {

    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public boolean ligarDesligar (boolean status){
        return !status;
    }
    public void mudarCanal(int canal){
         this.canal += canal;
    }
    public void mudarVolume(int volume){
         this.volume += volume;

    }
}

