public class SmartTv {

  boolean ligada = false;
  int canal = 1;
  int volume = 25;

  void ligar() {
    ligada = true;
  }

  void desligar() {
    ligada = false;
  }

  void aumentarCanal() {
    if (ligada) {
      canal++;
    }
  }

  void diminuirCanal() {
    if (ligada) {
      canal--;
    }
  }

  void mudarCanal(int novoCanal) {
    if (ligada) {
      canal = novoCanal;
    }
  }

  void aumentarVolume() {
    if (ligada) {
      volume++;
    }
  }

  void diminuirVolume() {
    if (ligada) {
      volume--;
    }
  }
}
