package entities;

import interfaces.Player;

public class Audio extends ElementoMultimediale  {

    //ATTRIBUTI di audio volume  durata nome


    private int volume;
    private int durata;

    //COSTRUTTORE

    public Audio(String name, String name1, int volume, int durata) {
        super(name);
        this.name = name1;
        this.volume = volume;
        this.durata = durata;
    }


    //METODO play()




    public void playAudio() {
        for (int i = 0; i < volume ; i++) {
            System.out.println("!");
        }
        for (int i = 0; i < durata ; i++) {
            System.out.println( "Nome Audio:" + this.name);
        }
    }
public void abbassaVolume(){
    System.out.println("Il volume di "+ this.name + " prima era: " + this.volume + " adesso è settato a: " +  (this.volume - 1) );

}
public void alzaVolume(){
    System.out.println("Il volume di "+ this.name + " prima era: " + this.volume + " adesso è settato a: " +  (this.volume + 1) );

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
