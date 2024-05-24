package entities;

import interfaces.Player;

public class Video extends ElementoMultimediale implements Player {

    //ATTRIBUTI durata volume luminosita nome

    private int luminosità;
    private int volume;
    private int durata;

    //COSTRUTTORE

    public Video(String name, String name1, int luminosità, int volume, int durata) {
        super(name);

        this.luminosità = luminosità;
        this.volume = volume;
        this.durata = durata;
    }

    //METODO play()
    @Override
    public void play(){
        System.out.println("Nome: " + this.name + "Luminosità: " + this.luminosità);
    }
}
/*
*
*
*
*
*
*
*
* */