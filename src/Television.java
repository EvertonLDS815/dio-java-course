public class Television {

    boolean isOpened = false;
    int canal = 1;
    int volume = 25;

    public void changeChannel(int novoCanal) {
        canal = novoCanal;
    }

    public void plusChannel() {
        canal++;
    }

    public void minusChannel() {
        canal++;
    }

    public void plus() {
        volume++;
        System.out.println("Aumentando o volume para: " + volume);
    }

    public void minus() {
        volume--;
        System.out.println("Diminuindo o volume para: " + volume);
    }

    public void ligar() {
        isOpened = true;
    }

    public void desligar() {
        isOpened = false;
    }

}
