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
        for (int i = 0; i < 1 ; i++) {
            System.out.println("-----INIZIO FOR------");
            StringBuilder asterisco = new StringBuilder();
            for (int j = 0; j < luminosità ; j++) {
                asterisco.append("*");
            }
            System.out.println(this.name + asterisco );

        }

    }

}
/*luminosita
* metodo show
*stampa il titolo concatenato a una sequenza di asterischi di lunghezza pari a luminosità
*
*    public void playAudio() {

    }
*
*
*
*
*
* */