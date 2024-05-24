package entities;

import interfaces.Shower;

public class Immagine extends ElementoMultimediale implements Shower {
    //ATTRIBUTI luminosita nome

   private int luminosità;


    //COSTRUTTORE


    public Immagine(String name, String name1, int luminosità) {
        super(name);

        this.luminosità = luminosità;
    }

    //METODO show()
@Override
    public void show(){
        System.out.println("Nome: " + this.name + "Luminosità: " + this.luminosità);
    }

}
