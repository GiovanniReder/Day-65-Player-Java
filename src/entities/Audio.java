package entities;

import interfaces.Player;

public class Audio extends ElementoMultimediale implements Player {

    //ATTRIBUTI di audio volume  durata nome


    private int volume;
    private int durata;

    //COSTRUTTORE

    public Audio(String name, int volume, int durata) {
        super(name);

        this.volume = volume;
        this.durata = durata;
    }


    //METODO play()


    public void play() {
        for (int i = 0; i < durata; i++) {
            System.out.println("-----INIZIO FOR AUDIO------");
            StringBuilder esclamativo = new StringBuilder();
            for (int j = 0; j < volume; j++) {
                esclamativo.append("!");
            }
            System.out.println(this.name + esclamativo);

        }
        System.out.println("-----FINE FOR AUDIO------");
    }


    public void abbassaVolume() {
        System.out.println("Il volume di " + this.name + " prima era: " + this.volume + " adesso è settato a: " + (this.volume - 1));
        this.volume--;
    }

    public void alzaVolume() {
        System.out.println("Il volume di " + this.name + " prima era: " + this.volume + " adesso è settato a: " + (this.volume + 1));
        this.volume++;
    }


}
/* audio è riproducibile con play
 * metodi abbassaVolume() e alzaVolume()
 *play stampa durata * (titolo + ("!" * volume)
 *
 *
 *
 *
 * */
