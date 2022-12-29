public class Usuario {
    public static void main (String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();


        System.out.println("TV Ligada ? "+ smartTv.ligada);
        System.out.println("Volume TV ? "+ smartTv.volume);
        System.out.println("Canal TV ? "+ smartTv.canal);


        smartTv.ligarDesligar(smartTv.ligada);

        System.out.println("Novo status -> " +smartTv.ligada);
        smartTv.mudarCanal(10);
        System.out.println("Novo canal -> " + smartTv.canal);

        smartTv.mudarVolume(20);
        System.out.println("Novo volume -> "+ smartTv.volume);
    }
}
