public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();
        System.out.println("canal atual: " +smartTv.canal);

        
        System.out.println("Volume atual:" + smartTv.volume);
        smartTv.mudarCanal(56);
        System.out.println("canal atual: " +smartTv.canal);

        smartTv.mudarCanal(20);
        System.out.println("canal atual: " +smartTv.canal);





        System.out.println("Tv está ligada ?" + smartTv.ligada);
        // System.out.println("Tv está em qual canal: " +smartTv.canal);
        System.out.println( "Tv está no volume: "+ smartTv.volume);

        smartTv.ligar();
        System.out.println("novo status: -> Tv ligada?" + smartTv.ligada);

        smartTv.desligar();
        System.out.println("Fi da mae, desligou?" + smartTv.ligada);
    }
}
