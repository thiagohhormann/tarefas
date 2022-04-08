package com.company;

public class Tv {
    private int canal, volume;

    public Tv(int canal, int volume) {
        this.canal = canal;
        this.volume = volume;
    }

    public void trocarCanal(int canal) {
        if ( 4 <= canal && canal <= 13) {
            this.canal = canal;
        } else System.out.println("Canal " + canal + " fora do ar!");
    }

    public void aumentarVolume() {
        this.volume += 1;
    }

    public void diminuirVolume() {
        this.volume -= 1;
    }

    public int getCanal() {
        return canal;
    }

    public void setCanal(int canal) {
        this.canal = canal;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}
