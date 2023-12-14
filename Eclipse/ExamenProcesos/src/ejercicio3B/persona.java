package ejercicio3B;

import java.util.concurrent.ThreadLocalRandom;

class persona implements Runnable {
    private ascensor ascensor;
    private int peso;

    public persona(ascensor ascensor) {
        this.ascensor = ascensor;
        this.peso = ThreadLocalRandom.current().nextInt(60, 101);
    }

    public void run() {
        try {
            ascensor.entrar(peso);
            Thread.sleep(ThreadLocalRandom.current().nextInt(1000, 5001));
            ascensor.salir(peso);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}