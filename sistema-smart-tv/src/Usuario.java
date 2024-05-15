public class Usuario {

  public static void main(String[] args) throws Exception {
    SmartTv smartTv = new SmartTv();

    System.out.println("A tv esta ligada? " + smartTv.ligada);
    System.out.println("canal atual: " + smartTv.canal);
    System.out.println("Volume atual: " + smartTv.volume);

    smartTv.ligar();

    System.out.println("A tv esta ligada? " + smartTv.ligada);

    smartTv.aumentarVolume();

    System.out.println("Volume atual: " + smartTv.volume);

    smartTv.diminuirVolume();
    smartTv.diminuirVolume();
    smartTv.diminuirVolume();

    System.out.println("Volume atual: " + smartTv.volume);

    smartTv.aumentarCanal();
    smartTv.aumentarCanal();

    System.out.println("canal atual: " + smartTv.canal);

    smartTv.mudarCanal(10);

    System.out.println("canal atual: " + smartTv.canal);

    smartTv.diminuirCanal();

    System.out.println("canal atual: " + smartTv.canal);

    smartTv.desligar();

    System.out.println("A tv esta ligada? " + smartTv.ligada);
  }
}
