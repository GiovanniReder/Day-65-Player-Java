package entities;

import interfaces.Player;

public class Video extends ElementoMultimediale implements Player {
    // ATTRIBUTI
    private int luminosità;
    private int volume;
    private int durata;

    // COSTRUTTORE
    public Video(String name, int luminosità, int volume, int durata) {
        super(name);
        this.luminosità = luminosità;
        this.volume = volume;
        this.durata = durata;
    }

    // METODO play()
    public void play() {
        System.out.println("-----INIZIO FOR VIDEO------");
        for (int i = 0; i < durata; i++) {
            StringBuilder esclamativo = new StringBuilder();
            StringBuilder asterisco = new StringBuilder();
            for (int j = 0; j < volume; j++) {
                esclamativo.append("!");
            }
            for (int j = 0; j < luminosità; j++) {
                asterisco.append("*");
            }
            System.out.println(this.name + esclamativo + asterisco);
        }
    }

    public void abbassaVolume() {
        System.out.println("Il volume di " + this.name + " prima era: " + this.volume + " adesso è settato a: " + (this.volume - 1));
        this.volume--;
    }

    public void alzaVolume() {
        System.out.println("Il volume di " + this.name + " prima era: " + this.volume + " adesso è settato a: " + (this.volume + 1));
        this.volume++;
    }

    public void alzaLuminosità() {
        System.out.println("Hai alzato la luminosità a: " + (this.luminosità + 1));
        this.luminosità++;
    }

    public void abbassaLuminosità() {
        System.out.println("Hai abbassato la luminosità a: " + (this.luminosità - 1));
        this.luminosità--;
    }

    @Override
    public void show() {

    }
}

/*
 *video riproducibile
 *METODI ALZA E ABBASSA VOLUME
 *METODI ALZA E ABBASSA LUMINOSITA
 *playvideo deve:
 *durata stampa il titolo n volte, n= durata
 *!=volume
 * *=luminosita
 *
 * */




