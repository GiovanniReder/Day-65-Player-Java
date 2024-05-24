package entities;

import interfaces.Shower;

public class Immagine extends ElementoMultimediale implements Shower {
    //ATTRIBUTI luminosita nome

    private int luminosità;


    //COSTRUTTORE


    public Immagine(String name, int luminosità) {
        super(name);

        this.luminosità = luminosità;
    }

    //METODO show()
    @Override
    public void show() {
        for (int i = 0; i < 1; i++) {
            System.out.println("-----INIZIO FOR IMMAGINE------");
            StringBuilder asterisco = new StringBuilder();
            for (int j = 0; j < luminosità; j++) {
                asterisco.append("*");
            }
            System.out.println(this.name + asterisco);

        }
        System.out.println("-----FINE FOR IMMAGINE------");
    }

    public void alzaLuminosità() {
        System.out.println("Hai alzato la luminosità a: " + (this.luminosità + 1));
        this.luminosità++;
    }

    public void abbassaLuminosità() {
        System.out.println("Hai abbassato la luminosità a: " + (this.luminosità - 1));
        this.luminosità--;
    }

}
/*luminosita
 * metodo show
 *stampa il titolo concatenato a una sequenza di asterischi di lunghezza pari a luminosità
 */